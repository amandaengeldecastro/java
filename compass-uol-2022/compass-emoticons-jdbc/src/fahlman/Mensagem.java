package fahlman;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Mensagem {
	private String mensagem;
	private String sentimento;
	
	public String getMensagem() {
		return mensagem;
	}
	public String getSentimento() {
		return sentimento;
	}
	
	public Mensagem(String mensagem) {
		this.mensagem = mensagem;
		
		String divertido = "\\:\\-\\)";
		String triste = "\\:\\-\\(";
		
		Pattern patternDivertido = Pattern.compile(divertido);
		Pattern patternTriste = Pattern.compile(triste);
		
		Matcher matcherD = patternDivertido.matcher(mensagem);
		Matcher matcherT = patternTriste.matcher(mensagem);
		
		long contadorTriste;
		long contadorDivertido;
		
		contadorTriste = matcherT.results().count();
		contadorDivertido = matcherD.results().count();
		
		if(contadorTriste < contadorDivertido) {
			sentimento = "divertido";
		} else if (contadorTriste == contadorDivertido) {
			sentimento = "neutro";
		} else {
			sentimento = "chateado";
		}
	}
	
}
