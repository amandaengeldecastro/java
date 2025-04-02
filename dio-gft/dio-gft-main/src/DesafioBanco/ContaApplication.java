package DesafioBanco;

public class ContaApplication {
	public static void main (String[]args) {
		Cliente amanda = new Cliente();
		amanda.setNome("Amanda");
		
		Conta cc = new ContaCorrente(amanda);
		Conta poupanca = new ContaPoupanca(amanda);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
