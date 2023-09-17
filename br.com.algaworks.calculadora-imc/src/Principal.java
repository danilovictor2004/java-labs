public class Principal {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.peso = 90;
        paciente.altura = 1.68;
        IndiceMassaCorporal imc = paciente.calcularIndiceMassaCorporal();

        if (imc.resultado > 30) {
            System.out.printf("Paciente com a altura %.2f e o peso de %.2f " +
                    "está com obesidade.%n", paciente.altura, paciente.peso);
        }

        System.out.printf("IMC: %.2f", imc.resultado);
    }
}
