import java.util.Scanner;

public class FolhaPagamento {

    Scanner scanner = new Scanner(System.in);

//    double calcularValorHorasTrabalhadas() {
//        System.out.print("Informe o total de horas trabalhadas: ");
//        int horasTrabalhadas = scanner.nextInt();
//
//        System.out.print("Informe o valor da hora trabalhadas: ");
//        double valorHora = scanner.nextDouble();
//
//        return horasTrabalhadas * valorHora;
//    }
//
//    double calcularValorHorasExtrasTrabalhadas() {
//
//        System.out.print("Informe total de horas extras trabalhadas: ");
//        int horaExtra = scanner.nextInt();
//
//        System.out.print("Informe valor por hora extra trabalhadas: ");
//        double valorExtra = scanner.nextDouble();
//
//        return horaExtra * valorExtra;
//    }

    double calcularSalario(Funcionario funcionario) {
        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
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
            contratoTrabalho.valorAdicional = total * 0.1;

        return total + contratoTrabalho.valorAdicional;
    }
}
