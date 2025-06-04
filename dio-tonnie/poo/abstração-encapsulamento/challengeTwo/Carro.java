import java.util.Scanner;

public class Carro {

    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro está agora LIGADO.");
        } else {
            System.out.println("O carro já está LIGADO.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O carro já está DESLIGADO.");
            return;
        }

        if (marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("O carro está agora DESLIGADO.");
        } else {
            System.out.println("Não é possível desligar o carro. Ele deve estar em ponto morto e parado.");
        }
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("Não é possível acelerar. O carro está DESLIGADO.");
            return;
        }

        if (marcha == 0) {
            System.out.println("Não é possível acelerar em ponto morto.");
            return;
        }

        if (velocidade < 120) {
            int novaVelocidade = velocidade + 1;
            if (velocidadePermitidaParaMarcha(novaVelocidade)) {
                velocidade = novaVelocidade;
                System.out.println("Acelerou. Velocidade atual: " + velocidade + " km/h.");
            } else {
                System.out.println("Não é possível acelerar: velocidade excede o limite permitido para a marcha atual.");
            }
        } else {
            System.out.println("Já está na velocidade máxima (120 km/h).");
        }
    }

    public void desacelerar() {
        if (!ligado) {
            System.out.println("Não é possível desacelerar. O carro está DESLIGADO.");
            return;
        }

        if (velocidade > 0) {
            velocidade -= 1;
            System.out.println("Desacelerou. Velocidade atual: " + velocidade + " km/h.");
        } else {
            System.out.println("O carro já está na velocidade mínima (0 km/h).");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("Não é possível trocar a marcha. O carro está DESLIGADO.");
            return;
        }

        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida. A marcha deve ser entre 0 e 6.");
            return;
        }

        if (Math.abs(novaMarcha - marcha) != 1) {
            System.out.println("Não é possível pular marchas. Troque de forma sequencial.");
            return;
        }

        marcha = novaMarcha;
        System.out.println("Marcha trocada para: " + marcha);
    }

    public void virar(String direcao) {
        if (!ligado) {
            System.out.println("Não é possível virar. O carro está DESLIGADO.");
            return;
        }

        if (!direcao.equalsIgnoreCase("esquerda") && !direcao.equalsIgnoreCase("direita")) {
            System.out.println("Direção inválida. Use 'esquerda' ou 'direita'.");
            return;
        }

        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando à " + direcao + ".");
        } else {
            System.out.println("Não é possível virar. A velocidade deve estar entre 1 km/h e 40 km/h.");
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h.");
    }

    public void verificarMarcha() {
        System.out.println("Marcha atual: " + marcha);
    }

    private boolean velocidadePermitidaParaMarcha(int velocidade) {
        switch (marcha) {
            case 1: return velocidade >= 0 && velocidade <= 20;
            case 2: return velocidade >= 21 && velocidade <= 40;
            case 3: return velocidade >= 41 && velocidade <= 60;
            case 4: return velocidade >= 61 && velocidade <= 80;
            case 5: return velocidade >= 81 && velocidade <= 100;
            case 6: return velocidade >= 101 && velocidade <= 120;
            default: return false;
        }
    }
}
