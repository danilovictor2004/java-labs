public class Principal {

    public static void main(String[] args) {
        GestorDeImpostos gestorDeImpostos = new GestorDeImpostos();

        var joao = new PessoaFisica("João da Silva", 35000);
        var maria = new PessoaFisica("Maria de Souza", 180000);

        var barDoCorinthians = new EmpresaLucroReal("Bar do Corinthians", 8000000, 6000000);
        var mercadinhoDaEsquina = new EmpresaSimples("Mercadinho da Esquina", 250000, 160000);

        gestorDeImpostos.adicionar(joao);
        gestorDeImpostos.adicionar(maria);
        gestorDeImpostos.adicionar(barDoCorinthians);
        gestorDeImpostos.adicionar(mercadinhoDaEsquina);

        System.out.printf("Total de impostos: R$ %.2f", gestorDeImpostos.getValorTotalImpostos());
    }

}
