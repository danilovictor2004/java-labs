import estoque.CadastroProduto;
import estoque.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Principal {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
//        List<Produto> produtos = cadastroProduto.obterTodos();

//        produtos.stream()
//                .filter(Produto::temEstoque)
//                .filter(Produto::isInativo)
//                .forEach(produto -> {
//                    produto.ativar();
//                    System.out.println(produto);
//                });

        List<Produto> produtos = new ArrayList<>();
        OptionalInt maiorValorOptional = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .reduce(Integer::max);

        int maiorValor = maiorValorOptional
                .orElseThrow(() -> new RuntimeException("Quantidade não encontrada"));

        System.out.println(maiorValor);

    }

}
