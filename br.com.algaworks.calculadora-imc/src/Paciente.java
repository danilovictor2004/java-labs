public class Paciente {
    double altura;
    double peso;

    IndiceMassaCorporal calcularIndiceMassaCorporal() {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.altura = this.altura;
        imc.peso = this.peso;
        imc.resultado =  this.peso / (this.altura * this.altura);
        return imc;
    }
}
