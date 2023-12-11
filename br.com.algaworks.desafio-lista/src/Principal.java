import java.util.List;

public class Principal {

    public static void main(String[] args) {
        CadastroPacoteViagem cadastro = new CadastroPacoteViagem();
        cadastro.adicionar("Istambul e Capadócia (20 noites)", 18_000);
        cadastro.adicionar("Neve em Bariloche (10 noites)", 11_000);
        cadastro.adicionar("Disney (10 noites)", 20_000);
        cadastro.adicionar("Natal Luz em Gramado (5 noites)", 8_500);

        cadastro.removerPorDescricao("Disney (7 noites)");

        cadastro.ordenar();
        cadastro.ordenarPorPrecoDecrescente();

        PacoteViagem pacoteEncontrado = cadastro.buscarPorDescricao("Disney (10 noites)");
        System.out.printf("Encontrado um pacote de viagem para %s que custa R$%.2f por pessoa%n ",
                pacoteEncontrado.getDescricao(), pacoteEncontrado.getPrecoPorPessoa());

        System.out.println();

        imprimirPacotes(cadastro.obterTodos());
    }

    private static void imprimirPacotes(List<PacoteViagem> pacotes) {
        // TODO iterar nos pacotes e imprimir descrição e preço
        for (PacoteViagem pacote : pacotes) {
            System.out.printf("Viagem para %s custa R$%.2f por pessoa%n ",
                    pacote.getDescricao(), pacote.getPrecoPorPessoa());
        }

    }

}
