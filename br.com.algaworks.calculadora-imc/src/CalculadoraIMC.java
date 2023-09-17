public class CalculadoraIMC {

    IndiceMassaCorporal calcular(double peso, double altura) {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }

}