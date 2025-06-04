public class MaquinaDeBanhoPet {

    private int nivelAgua;
    private int nivelShampoo;
    private boolean temPet;
    private boolean maquinaSuja;
    private boolean petEstaLimpo;

    private static final int MAX_AGUA = 30;
    private static final int MAX_SHAMPOO = 10;

    public MaquinaDeBanhoPet() {
        this.nivelAgua = 0;
        this.nivelShampoo = 0;
        this.temPet = false;
        this.maquinaSuja = false;
        this.petEstaLimpo = false;
    }

    public void colocarPet() {
        if (temPet) {
            System.out.println("Já existe um pet na máquina.");
            return;
        }
        if (maquinaSuja) {
            System.out.println("Não é possível colocar um novo pet. A máquina está suja, por favor, limpe-a primeiro.");
            return;
        }
        temPet = true;
        petEstaLimpo = false;
        System.out.println("Pet colocado na máquina.");
    }

    public void retirarPet() {
        if (!temPet) {
            System.out.println("Não há pet para retirar.");
            return;
        }
        temPet = false;

        if (!petEstaLimpo) {
            maquinaSuja = true;
            System.out.println("Pet retirado, mas a máquina agora está suja e precisa ser limpa antes do próximo uso.");
        } else {
            System.out.println("Pet retirado. A máquina está limpa.");
        }
    }

    public void darBanho() {
        if (!temPet) {
            System.out.println("Não há pet na máquina para dar banho.");
            return;
        }
        if (nivelAgua < 10 || nivelShampoo < 2) {
            System.out.println("Recursos insuficientes para dar banho. Por favor, verifique os níveis de água e shampoo.");
            return;
        }
        nivelAgua -= 10;
        nivelShampoo -= 2;
        petEstaLimpo = true;
        System.out.println("Banho realizado com sucesso! O pet agora está limpo.");
    }

    public void abastecerAgua() {
        if (nivelAgua + 2 <= MAX_AGUA) {
            nivelAgua += 2;
            System.out.println("Adicionados 2L de água. Nível atual de água: " + nivelAgua + "L.");
        } else {
            System.out.println("Não é possível adicionar mais água. Capacidade máxima: " + MAX_AGUA + "L.");
        }
    }

    public void abastecerShampoo() {
        if (nivelShampoo + 2 <= MAX_SHAMPOO) {
            nivelShampoo += 2;
            System.out.println("Adicionados 2L de shampoo. Nível atual de shampoo: " + nivelShampoo + "L.");
        } else {
            System.out.println("Não é possível adicionar mais shampoo. Capacidade máxima: " + MAX_SHAMPOO + "L.");
        }
    }

    public void verificarNivelAgua() {
        System.out.println("Nível atual de água: " + nivelAgua + "L.");
    }

    public void verificarNivelShampoo() {
        System.out.println("Nível atual de shampoo: " + nivelShampoo + "L.");
    }

    public void verificarSeTemPet() {
        if (temPet) {
            System.out.println("Há um pet na máquina.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }

    public void limparMaquina() {
        if (!maquinaSuja) {
            System.out.println("A máquina já está limpa.");
            return;
        }

        if (nivelAgua < 3 || nivelShampoo < 1) {
            System.out.println("Recursos insuficientes para limpar a máquina. Por favor, abasteça água e shampoo.");
            return;
        }

        nivelAgua -= 3;
        nivelShampoo -= 1;
        maquinaSuja = false;
        System.out.println("Máquina limpa com sucesso.");
    }
}
