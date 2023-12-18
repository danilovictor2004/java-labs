package Model;

import java.util.Objects;

public class Proprietario {

    private final String nome;
    private final String cpf;

    public Proprietario(String nome, String cpf) {
        Objects.requireNonNull(nome);
        Objects.requireNonNull(cpf);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Proprietario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Proprietario that = (Proprietario) o;

        return cpf.equals(that.cpf);
    }

    @Override
    public int hashCode() {
        return cpf.hashCode();
    }

}
