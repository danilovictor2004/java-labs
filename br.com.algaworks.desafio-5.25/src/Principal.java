public class Principal {
    public static void main(String[] args) {
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        Funcionario funcionario = new Funcionario();

        double totalReceber = folhaPagamento.calcularSalario(funcionario);

        System.out.printf("O funcionário %s irá receber R$ %.2f de salário ", funcionario.nome, totalReceber);
    }
}
