public class Principal {
    public static void main(String[] args) {
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();

        double totalReceber = folhaPagamento.calcularSalario(contratoTrabalho);

        System.out.printf("O funcionário %s irá receber R$ %.2f de salário ", contratoTrabalho.funcionario.nome, totalReceber);
    }
}
