public class Principal {
    public static void main(String[] args) {
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();

        Holerite totalReceber = folhaPagamento.calcularSalario(contratoTrabalho);
        totalReceber.imprimirHolerite();
    }
}
