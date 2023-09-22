public class Principal {
    public static void main(String[] args) {
        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Funcionario funcionario = folhaPagamento.construirFuncionario();
        ContratoTrabalho contratoTrabalho = folhaPagamento.construirContrato();
        contratoTrabalho.funcionario = funcionario;

        Holerite holerite = folhaPagamento.calcularSalario(contratoTrabalho);
        holerite.imprimirHolerite();
    }
}
