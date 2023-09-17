import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
        Paciente paciente = new Paciente();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a altura: ");
        paciente.altura = scanner.nextDouble(); //1.82;

        System.out.print("Informe o peso: ");
        paciente.peso = scanner.nextDouble(); //175;

        IndiceMassaCorporal imc = calculadoraIMC.calcular(paciente);

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
                    "está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }

}