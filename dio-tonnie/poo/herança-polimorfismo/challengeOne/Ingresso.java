public abstract class Ingresso {
    /*Abstract classes allow getters */
    private double valor;
    private String nomeFilme;

    public Ingresso(double valor, String nomeFilme){
        this.valor = valor;
        this.nomeFilme = nomeFilme;
    }

    public double getValor() {
        return valor;
    }

    public String nomeFilme(){
        return nomeFilme;
    }
    /*Method that will be overrite */
    public abstract double getValorReal();

    @Override
    public String toString() {
        return nomeFilme  + " - R$" + String.format("%.2f", getValorReal());
    }

}
