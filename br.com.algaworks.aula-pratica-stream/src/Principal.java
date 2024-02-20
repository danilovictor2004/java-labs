import estoque.CadastroProduto;
import estoque.Produto;

import java.util.List;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Stream<Produto> produtoStream = produtos.stream();

        Stream<Produto> streamComEstoque = produtoStream.filter(Produto::temEstoque);

        Stream<Produto> streamComEstoqueInativo = streamComEstoque.filter(Produto::isInativo);

        streamComEstoqueInativo.forEach(produto -> {
            produto.ativar();
            System.out.println(produto);
        });

    }

}
