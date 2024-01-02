public class ExtracaoNome {

    public static void main(String[] args) {
        String nome = "João Silva Souza";

        System.out.println(obterSobrenome(nome));
    }

    private static String obterSobrenome(String nome) {
        int posicaoPrimeiroEspaco = nome.indexOf(" ");

        if (posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo.");
        }

        return nome.substring(posicaoPrimeiroEspaco + 1);
    }

    private static String obterSegundoNome(String nome) {
        int posicaoPrimeiroEspaco = nome.indexOf(" ");
        int posicaoSegundoNome = nome.indexOf(" ", posicaoPrimeiroEspaco + 1);

        if (posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo.");
        }

        return nome.substring(posicaoPrimeiroEspaco + 1,
                posicaoSegundoNome < 0 ? nome.length() : posicaoSegundoNome);
    }

}
