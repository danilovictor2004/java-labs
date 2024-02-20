import estoque.CadastroProduto;
import estoque.Produto;

import java.util.List;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        for (Produto produto : produtos) {
//            produto.ativar();
//            System.out.println(produto);
//        }

        // Usando Stream
        Stream<Produto> produtoStream = produtos.stream();
        produtoStream.forEach(produto -> {
            produto.ativar();
            System.out.println(produto);
        });

    }

}
