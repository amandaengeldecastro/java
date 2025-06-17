import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> removerItems = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    removerItems.add(i);
                }
            }
            itemList.removeAll(removerItems);
        } else {
            System.out.println("A lista está vazia!");
        }

    }

    public double calcularValorTotal() {
        double valorTotal = 0d;

        for (Item item : itemList) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;

    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("Lista vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Notebook", 2.500d, 3);
        carrinhoDeCompras.adicionarItem("NotePad", 2.000d, 3);
        carrinhoDeCompras.adicionarItem("SmartWatch", 500d, 3);

        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total: R$" + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("NotePad");
        carrinhoDeCompras.exibirItens();

    }
}
