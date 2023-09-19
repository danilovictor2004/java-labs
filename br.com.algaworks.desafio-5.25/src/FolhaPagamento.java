import java.util.Scanner;

public class FolhaPagamento {
    private static final double PERCENTUAL_ADICIONAL = 1.1;

    Scanner scanner = new Scanner(System.in);

    double calcularSalario(ContratoTrabalho contratoTrabalho) {
        Funcionario funcionario = new Funcionario();

        contratoTrabalho.funcionario = funcionario;

        System.out.print("Funcionário: ");
        contratoTrabalho.funcionario.nome = scanner.next();

        System.out.print("Total de filhos: ");
        contratoTrabalho.funcionario.quantidadeFilho = scanner.nextInt();

        System.out.print("Informe o total de horas trabalhadas: ");
        contratoTrabalho.horaTrabalhada = scanner.nextInt();

        System.out.print("Informe o valor da hora trabalhadas: ");
        contratoTrabalho.valorHora = scanner.nextDouble();

        System.out.print("Informe total de horas extras trabalhadas: ");
        contratoTrabalho.horaExtraTrabalhada = scanner.nextInt();

        System.out.print("Informe valor por hora extra trabalhadas: ");
        contratoTrabalho.valorHoraExtra = scanner.nextDouble();
        contratoTrabalho.valorAdicional = 0;

        double total = contratoTrabalho.valorHora * contratoTrabalho.horaTrabalhada;

        if (funcionario.possuiFilho())
            return total * PERCENTUAL_ADICIONAL;

        return total;
    }
}
