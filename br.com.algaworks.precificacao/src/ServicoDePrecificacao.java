public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto,  double percentualMargemLucro) {
        double precoVendaCalculado = produto.precoCusto * ((percentualMargemLucro / 100) + 1);
        produto.precoVenda = precoVendaCalculado + Produto.custoEmbalagem;
    }

}
