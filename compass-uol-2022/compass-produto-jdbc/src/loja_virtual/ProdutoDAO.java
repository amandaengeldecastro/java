package loja_virtual;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoDAO {

	private Connection connection;

	public ProdutoDAO(Connection connection) {
		this.connection = connection;
	}

	public void salvar(Produto produto) {
		try {
			String sql = "INSERT INTO PRODUTO (ID, NOME, DESCRICAO, DESCONTO, DATA_CADASTRO) VALUES (?, ?, ?, ?, ?)";

			try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
				
				pstm.setInt(1, produto.getId());
				pstm.setString(2, produto.getNome());
				pstm.setString(3, produto.getDescricao());
				pstm.setDouble(4, produto.getDesconto());
				pstm.setString(5, produto.getData());
				
				pstm.execute();

				try (ResultSet rst = pstm.getGeneratedKeys()) {
					while (rst.next()) {
						produto.setId(rst.getInt(1));
					}
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	

	public void listar() {
		String chave = "geracao";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Palavra chave: ");
		chave = entrada.nextLine();
					
		List<Produto> produtos = new ArrayList<Produto>();
		try {
			String sql = "SELECT * FROM PRODUTO WHERE DESCRICAO LIKE ?";
			

			try (PreparedStatement pstm = connection.prepareStatement(sql)) {
				pstm.setString(1, "%" + chave + "%");
				pstm.execute();
				trasformarResultSetEmProduto(produtos, pstm);
			}
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		for(Produto p: produtos) {
			System.out.println(p.getId() + p.getNome()+ p.getDescricao() + p.getDesconto()+p.getData());
    	}
	}

	
	public void deletar(Integer id) {
		try (PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID = ?")) {
			stm.setInt(1, id);
			stm.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void alterar(String nome, String descricao, Integer id) {
		try (PreparedStatement stm = connection
				.prepareStatement("UPDATE PRODUTO P SET P.NOME = ?, P.DESCRICAO = ? WHERE ID = ?")) {
			stm.setString(1, nome);
			stm.setString(2, descricao);
			stm.setInt(3, id);
			stm.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private void trasformarResultSetEmProduto(List<Produto> produtos, PreparedStatement pstm) throws SQLException {
		try (ResultSet rst = pstm.getResultSet()) {
			while (rst.next()) {
				Produto produto = new Produto(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getFloat(4), rst.getString(5));

				produtos.add(produto);
				
			}
		}
	}
}
