package fahlman;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class MensagemDAO {

	private Connection connection;


	public MensagemDAO(Connection connection){
		this.connection = connection;
	}

	public void salvar(Mensagem mensagem) {
		try {
			String sql = "INSERT INTO MENSAGEM ( MENSAGEM, STATUS) VALUES (?, ?)";

			try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

				pstm.setString(1, mensagem.getMensagem());
				pstm.setString(2, mensagem.getSentimento());

				pstm.execute();

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
