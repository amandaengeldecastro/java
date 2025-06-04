public class IngressoFamilia extends Ingresso{
    
    private int numeroPessoas;

    public IngressoFamilia(double valor, String nomeFilme, int numeroPessoas) {
        super(valor, nomeFilme);
        this.numeroPessoas = numeroPessoas;

    }

    @Override
    public double getValorReal() {
        double total = getValor() * numeroPessoas;
        if (numeroPessoas > 3) {
            total *= 0.95; /* 5% discount */ 
        }
        return total;
    }
}
