public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto,  double percentualMargemLucro) {
        double precoVendaCalculado = Matematica.calcularAcrescimento(produto.precoCusto, percentualMargemLucro);
        produto.precoVenda = precoVendaCalculado + Produto.custoEmbalagem;
    }

}
