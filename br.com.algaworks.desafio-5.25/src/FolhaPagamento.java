import java.util.Scanner;

public class FolhaPagamento {

    Scanner scanner = new Scanner(System.in);

    double calcularHorasTrabalhadas() {
        System.out.print("Informe o total de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Informe o valor da hora trabalhadas: ");
        double valorHora = scanner.nextDouble();

        return horasTrabalhadas * valorHora;
    }

    double calcularHorasExtrasTrabalhadas() {

        System.out.print("Informe total de horas extras trabalhadas: ");
        int horaExtra = scanner.nextInt();

        System.out.print("Informe valor por hora extra trabalhadas: ");
        double valorExtra = scanner.nextDouble();

        return horaExtra * valorExtra;
    }

    double calcularSalario() {
        double valorTotalTrabalhadas = calcularHorasTrabalhadas();
        double valorTotalExtraTrabalhadas = calcularHorasExtrasTrabalhadas();
        return valorTotalTrabalhadas + valorTotalExtraTrabalhadas;
    }
}
