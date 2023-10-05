import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        this.itens = Arrays.copyOf(this.itens, this.itens.length + 1);
        itens[itens.length - 1] = item;
    }

    void removerItem(int indice) {
        ItemCardapio[] novosItens = new ItemCardapio[this.itens.length - 1];

        System.arraycopy(this.itens, 0, novosItens, 0, indice);
        System.arraycopy(this.itens, indice + 1, novosItens, indice, novosItens.length - indice);

        itens = novosItens;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (var item : itens) {
            if (item.preco >= precoMinimo && item.preco <= precoMaximo) {
                System.out.printf("Descrição: %s - R$ %.2f%n", item.descricao, item.preco);
            }
        }
    }

}
