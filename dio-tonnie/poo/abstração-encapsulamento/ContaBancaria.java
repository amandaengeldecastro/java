
public class ContaBancaria {
    private double saldo;
    private double limiteChequeEspecial;
    private double chequeEspecialUsado;

    private static final double TAXA_CHEQUE_ESPECIAL = 0.20;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
        this.chequeEspecialUsado = 0;

        if (saldoInicial <= 500) {
            this.limiteChequeEspecial = 50;
        } else {
            this.limiteChequeEspecial = saldoInicial * 0.5;
        }
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public void consultarChequeEspecial() {
        System.out.printf("Limite do cheque especial: R$ %.2f%n", limiteChequeEspecial);
    }

    public void consultarChequeEspecialUsado() {
        System.out.printf("Cheque especial usado: R$ %.2f%n", chequeEspecialUsado);
    }

    public boolean estaUsandoChequeEspecial() {
        return chequeEspecialUsado > 0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }

        if (chequeEspecialUsado > 0) {
            double taxa = chequeEspecialUsado * TAXA_CHEQUE_ESPECIAL;
            double totalDevido = chequeEspecialUsado + taxa;

            if (valor >= totalDevido) {
                valor -= totalDevido;
                chequeEspecialUsado = 0;
                System.out.printf("Cheque especial quitado com taxa de R$ %.2f%n", taxa);
            } else {
                double valorQuitado = valor / (1 + TAXA_CHEQUE_ESPECIAL);
                chequeEspecialUsado -= valorQuitado;
                System.out.printf("Parte do cheque especial foi quitada: R$ %.2f%n", valorQuitado);
                return;
            }
        }

        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        double totalDisponivel = getSaldoDisponivel();

        if (valor > totalDisponivel) {
            System.out.println("Saldo insuficiente, mesmo com o cheque especial.");
        } else if (valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            double restante = valor - saldo;
            saldo = 0;
            chequeEspecialUsado += restante;
            System.out.printf("Saque de R$ %.2f realizado com uso de R$ %.2f do cheque especial.%n", valor, restante);
        }
    }

    public void pagarBoleto(double valor) {
        System.out.printf("Tentando pagar boleto de R$ %.2f%n", valor);
        sacar(valor);
    }

    public double getSaldoDisponivel() {
        return saldo + (limiteChequeEspecial - chequeEspecialUsado);
    }
}
