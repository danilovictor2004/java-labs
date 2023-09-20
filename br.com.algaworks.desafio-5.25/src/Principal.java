public class Principal {
    public static void main(String[] args) {
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();

        Holerite holerite = folhaPagamento.calcularSalario(contratoTrabalho);
        holerite.imprimirHolerite();
    }
}
