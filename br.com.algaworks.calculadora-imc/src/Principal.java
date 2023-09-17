public class Principal {

    public static void main(String[] args) {
        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
        calculadoraIMC.altura = 1.82;
        calculadoraIMC.peso = 175;

        IndiceMassaCorporal imc = calculadoraIMC.calcular();

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
                    "está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }

}