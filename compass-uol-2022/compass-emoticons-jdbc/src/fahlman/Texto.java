package fahlman;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Texto {
	
	public static void main (String [] args) throws SQLException {
	System.out.println("Expresse o seus sentimentos: ");
	
	Scanner entrada = new Scanner(System.in);
	String texto = entrada.nextLine();

	Mensagem mensagem = new Mensagem(texto);
	
	try(Connection connection = new ConnectionFactory().recuperarConexao()){
		MensagemDAO mensagemDao = new MensagemDAO(connection);
			System.out.println(mensagem.getSentimento());
			mensagemDao.salvar(mensagem);
	

		}
	entrada.close();
	}
}
