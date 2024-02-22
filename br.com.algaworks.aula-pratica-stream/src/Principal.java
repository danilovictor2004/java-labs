import estoque.CadastroProduto;
import estoque.Produto;

import java.util.*;

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

//        List<Produto> produtos = new ArrayList<>();
//        OptionalInt maiorValorOptional = produtos.stream()
//                .mapToInt(Produto::getQuantidade)
//                .reduce(Integer::max);
//
//        int maiorValor = maiorValorOptional
//                .orElseThrow(() -> new RuntimeException("Quantidade não encontrada"));
//
//        System.out.println(maiorValor);

        // menor valor do produto que tem estoque
        List<Produto> produtos = cadastroProduto.obterTodos();

        Produto menorPreco = produtos.stream()
                .filter(Produto::temEstoque)
                .min(Comparator.comparing(Produto::getPreco))
                .orElseThrow(() -> new RuntimeException("Menor preço de produto não encontrado."));
        System.out.printf("O menor preço é o produto %s que custa R$ %.2f%n",
                menorPreco.getNome(), menorPreco.getPreco());

        Produto maiorPreco = produtos.stream()
                .filter(Produto::temEstoque)
                .max(Comparator.comparing(Produto::getPreco))
                .orElseThrow(() -> new RuntimeException("Maior preço de produto não encontrado."));
        System.out.printf("O maior preço é o produto %s que custa R$ %.2f",
                maiorPreco.getNome(), maiorPreco.getPreco());

    }

}
