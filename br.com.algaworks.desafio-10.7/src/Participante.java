import java.util.Objects;

public class Participante {

    String nome;
    int saldoDePontos;

    public Participante(String nome) {
        this(nome, 0);
        Objects.requireNonNull(nome, "Informar o nome é obrigatório");
    }

    public Participante(String nome, int saldoDePontos) {
        if (saldoDePontos < 0) {
            throw new IllegalArgumentException("O saldo de pontos não pode ser menor que zero.");
        }

        this.nome = nome;
        this.saldoDePontos = saldoDePontos;
    }

}
