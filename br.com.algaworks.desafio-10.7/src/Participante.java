public class Participante {

    static final int SALDO_DE_PONTOS = 0;

    String nome;
    int saldoDePontos;

    public Participante(String nome) {
        this(nome, SALDO_DE_PONTOS);
    }

    public Participante(String nome, int saldoDePontos) {
        this.nome = nome;
        this.saldoDePontos = saldoDePontos;

        if (saldoDePontos < 0) {
            System.out.println("O saldo de pontos não pode ser menor que zero.");
        }

    }

}
