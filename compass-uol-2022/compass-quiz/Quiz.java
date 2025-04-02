import java.util.Scanner;

class Usuario{
	String usuario;
	
	public Usuario(String usuario){
	this.usuario = usuario;
	}
}

class Pergunta{
	String pergunta;
	String resposta;
	
	public Pergunta(String pergunta, String resposta){
	this.pergunta =  pergunta;
	this.resposta = resposta;
	}
	
}


public class Quiz{
	public static void main(String [] args){
				
		String p1 = "\n1 - Scrum é um framework ágil que tem como principal característica trabalhar com time-boxes.\nSendo assim, ela divide uma sprint em 4 principais eventos.\nQual das opções abaixo, NÃO representa um dos eventos de uma Scrum?\n" +
					"a) Daily\n" +
					"b) Sprint planing\n" +
					"c) Sprint PO\n" +
					"d) Sprint Review\n" +
					"e) Retrospectiva\n"; 
					//resposta c
					
		String p2 = "\n2 - Em HTML usamos estruturas, denominadas tags, que irformam ao navegador a estrutura do site.\nQual tag HTML é usada de âncora para criar links na web?\n" +
					"a) <script>\n"+
					"b) <a>\n" +
					"c) <input>\n" +
					"d) <h1>\n" +
					"e) <button>\n"; 
					//resposta b
					
		String p3 = "\n3 - HTML DOM é a interface entre a linguagem JavaScript e os objetos do HTML.\nJá os eventos HTML DOM, permitem a manipulação de elementos contidos em um documento HTML.\nQual dos eventos, executa um Javascript quando um botão for clicado? \n" +
					"a) onclick\n" +
					"b) onmouseover\n" +
					"c) onmouseout\n" +
					"d) onmousup\n" +
					"e) onmousedown\n"; 
					//resposta a
					
		String p4 = "\n4 - Git é um sistema opensource de controle de versão que permite que equipes trabalhem paralelamente com projetos que tenham uma base de código comum.\nInicialmente, é preciso usar o terminal de comando e atribuir variáveis de configuração,como o nome do usuário, através do comando: \n" +
					"a) git init\n" +
					"b) git log --help\n" +
					"c) git config --local user.name\n" +
					"d) git pull\n" +
					"e) git add\n"; 
					//resposta c

		String p5 = "\n5 - A Programação Orientada a Objetos (POO) é consitutida por quatro pilares, sendo eles: \n" +
					"a) Classe, Objeto, Método e Encapsulamento\n" +
					"b) Objeto, Herança, Polimorfismo e Encapsulamento\n" +
					"c) Classe, Abstração, Encapsulamento e Polimorfismo\n" +
					"d) Abstração, Getters, Setter e Polimorfismo\n" +
					"e) Abstração, Encapsulamento, Herança e Polimorfismo\n"; 
					//resposta e
					
			Pergunta [] perguntas = {
				new Pergunta(p1, "c"),
				new Pergunta(p2, "b"),
				new Pergunta(p3, "a"),
				new Pergunta(p4, "c"),
				new Pergunta(p5, "e")
			};
			reconhecerUsuario();
			executarTeste(perguntas);
		}
		
		public static void reconhecerUsuario(){
			String usuario;
			Scanner entrada = new Scanner(System.in);
			System.out.println("Insira o nome do usuario:\n");
			usuario = entrada.nextLine();
		}

		
		public static void executarTeste(Pergunta [] perguntas){
			int acertos = 0;
			int erros = 0;
					
			Scanner entrada = new Scanner(System.in);
			
			for (int i = 0; i<perguntas.length; i++){
				System.out.println(perguntas[i].pergunta);
				String resposta = entrada.nextLine();
				if (resposta.equals(perguntas[i].resposta)){
					acertos++;
					System.out.println("\nVocê acertou!\n");
				} else {
					erros++;
					System.out.println("\nVocê errou!\n");

			}	
		}
		
		System.out.println("\nAcertos: " + acertos +"\nErros: " + erros);
	}
	

}