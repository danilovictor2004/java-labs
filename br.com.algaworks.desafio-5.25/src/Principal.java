public class Principal {
    public static void main(String[] args) {
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        double totalReceber = folhaPagamento.calcularSalario();

        System.out.printf("O funcionário irá receber R$ %.2f de salário ", totalReceber);
    }
}
