public class RelogioAmericano extends Relogio {

    public RelogioAmericano(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public String exibirHora() {
        int hora12 = getHora() % 12;
        if (hora12 == 0) {
            hora12 = 12;
        }
        String periodo = (getHora() < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", hora12, getMinuto(), getSegundo(), periodo);
    }

    @Override
    public void sincronizarCom(Relogio outroRelogio) {
        setHora(outroRelogio.getHora());
        setMinuto(outroRelogio.getMinuto());
        setSegundo(outroRelogio.getSegundo());
    }
}
