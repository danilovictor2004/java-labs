import java.util.Scanner;

public class FolhaPagamento {
    private static final double PERCENTUAL_ADICIONAL = 0.1;

    Scanner scanner = new Scanner(System.in);

    Holerite calcularSalario() {

        Funcionario funcionario = construirFuncionario();
        ContratoTrabalho contrato = construirContrato();

        Holerite holerite = new Holerite();
        contrato.funcionario = funcionario;
        holerite.funcionario = contrato.funcionario;
        holerite.funcionario.nome = funcionario.nome;
        holerite.valorTotalHora = contrato.valorHora * contrato.horaTrabalhada;
        holerite.valorTotalHoraExtra = contrato.valorHoraExtra * contrato.horaExtraTrabalhada;

        if (holerite.funcionario.possuiFilho())
            holerite.valorAdicional = holerite.calcularValorTotal() * PERCENTUAL_ADICIONAL;

        return holerite;
    }

    private Funcionario construirFuncionario() {
        Funcionario novoFuncionario = new Funcionario();

        System.out.print("Funcionário: ");
        novoFuncionario.nome = scanner.next();

        System.out.print("Total de filhos: ");
        novoFuncionario.quantidadeFilho = scanner.nextInt();

        return novoFuncionario;
    }

    private ContratoTrabalho construirContrato() {
        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();

        System.out.print("Informe o total de horas trabalhadas: ");
        contratoTrabalho.horaTrabalhada = scanner.nextInt();

        System.out.print("Informe o valor da hora trabalhadas: ");
        contratoTrabalho.valorHora = scanner.nextDouble();

        System.out.print("Informe total de horas extras trabalhadas: ");
        contratoTrabalho.horaExtraTrabalhada = scanner.nextInt();

        System.out.print("Informe valor por hora extra trabalhadas: ");
        contratoTrabalho.valorHoraExtra = scanner.nextDouble();

        return contratoTrabalho;
    }
}
