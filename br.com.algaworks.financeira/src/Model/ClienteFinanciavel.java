package Model;

public interface ClienteFinanciavel {

    double calcularLimiteAprovado();
    default double calcularJuros (double valorSolicitado) {
        if (valorSolicitado <= 100000){
            return 1.0;
        } else if (valorSolicitado <= 100000000) {
            return 1.5;
        }

        return 2.0;
    }

}
