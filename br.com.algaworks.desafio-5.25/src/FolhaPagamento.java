import java.util.Scanner;

public class FolhaPagamento {
    private static final double PERCENTUAL_ADICIONAL = 0.1;

    Scanner scanner = new Scanner(System.in);

    Holerite calcularSalario(ContratoTrabalho contratoTrabalho) {
        Funcionario funcionario = getFuncionario(contratoTrabalho);

        Holerite holerite = new Holerite();
        holerite.funcionario = contratoTrabalho.funcionario;
        holerite.funcionario.nome = contratoTrabalho.funcionario.nome;
        holerite.valorTotalHora = contratoTrabalho.valorHora * contratoTrabalho.horaTrabalhada;
        holerite.valorTotalHoraExtra = contratoTrabalho.valorHoraExtra * contratoTrabalho.horaExtraTrabalhada;

        if (funcionario.possuiFilho())
            holerite.valorAdicional = holerite.calcularValorTotal() * PERCENTUAL_ADICIONAL;

        return holerite;
    }

    private Funcionario getFuncionario(ContratoTrabalho contratoTrabalho) {
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

        return funcionario;
    }
}
