package loja_virtual;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class App {
	public static void main(String[]args) throws SQLException{

		
        Scanner entrada = new Scanner(System.in);
        
        String texto = "Por favor, insira o numero da opcao que deseja:\n";
        texto = texto.concat("1 - Cadastrar ofertas\n");
        texto = texto.concat("2 - Atualizar oferta\n");
        texto = texto.concat("3 -Excluir oferta\n");
        texto = texto.concat("4 -Listar produtos\n");
        texto = texto.concat("5 - Sair");
        System.out.println(texto);
        
        int opcao = Integer.valueOf(entrada.nextLine());
       
        
        switch(opcao){
            case 1:
            	
            	try(Connection connection = new ConnectionFactory().recuperarConexao()){
        			ProdutoDAO produtoDao = new ProdutoDAO(connection);
        			System.out.println("");
        			produtoDao.salvar(new Produto(12344,"Smartphone","8 geracao",0.25,"2021-01-01"));
        			produtoDao.salvar(new Produto(12354,"Smartphone","9 geracao",0.25,"2021-01-02"));
        			produtoDao.salvar(new Produto(12637,"Smartphone","10 geracao",0.25,"2021-01-03"));
        			connection.close();
        		}
            	
            break;
            
            case 2:
            	try(Connection connection = new ConnectionFactory().recuperarConexao()){
        			ProdutoDAO produtoDao = new ProdutoDAO(connection);
        			produtoDao.alterar("Smartphone", "7 geracao", 12344);
        			connection.close();
            	}
            break;
            
            case 3:
            	try(Connection connection = new ConnectionFactory().recuperarConexao()){
        			ProdutoDAO produtoDao = new ProdutoDAO(connection);
        			produtoDao.deletar(12344);
        			connection.close();
            	}
            	
            break;
            
            case 4:
            	try(Connection connection = new ConnectionFactory().recuperarConexao()){
        			ProdutoDAO produtoDao = new ProdutoDAO(connection);
        			produtoDao.listar();
        			connection.close();
        		            	}
            break;
            
            case 5:
            	System.exit(0);
            break;
        }
    }
}