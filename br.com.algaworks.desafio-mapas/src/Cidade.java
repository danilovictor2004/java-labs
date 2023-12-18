public class Cidade {

    private final int codigoIbge;
    private final String nome;
    private final int totalHabitantes;

    public Cidade(int codigoIbge, String nome, int totalHabitantes) {
        this.codigoIbge = codigoIbge;
        this.nome = nome;
        this.totalHabitantes = totalHabitantes;
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }

    public String getNome() {
        return nome;
    }

    public int getTotalHabitantes() {
        return totalHabitantes;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "codigoIbge=" + codigoIbge +
                ", nome='" + nome + '\'' +
                ", totalHabitantes=" + totalHabitantes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cidade cidade = (Cidade) o;

        return codigoIbge == cidade.codigoIbge;
    }

    @Override
    public int hashCode() {
        return codigoIbge;
    }
}
