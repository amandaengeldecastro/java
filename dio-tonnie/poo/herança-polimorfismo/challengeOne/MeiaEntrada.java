public class MeiaEntrada  extends Ingresso{
    
    public MeiaEntrada(double valor, String nomeFilme) {
        super(valor, nomeFilme);
    }

    @Override
    public double getValorReal() {
        return getValor() / 2;
    }
}
