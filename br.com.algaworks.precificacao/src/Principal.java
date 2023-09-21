public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.alterarPrecoCusto(100);
        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(produto, 20);

        System.out.printf("Preço de compra: %.2f%n", produto.precoCusto);
        System.out.printf("Preço de venda: %.2f%n", produto.precoVenda);
    }


}
