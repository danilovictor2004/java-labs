public class ExtracaoNome {

    public static void main(String[] args) {
        String nome = "João José da Silva";

        System.out.println(obterUltimoNome(nome));
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

    private static String obterUltimoNome(String nome) {
        int posicaoUltimoNome = nome.lastIndexOf(" ");

        if (posicaoUltimoNome < 0) {
            throw new RuntimeException("Não é um nome completo.");
        }

        return nome.substring(posicaoUltimoNome + 1);
    }

}
