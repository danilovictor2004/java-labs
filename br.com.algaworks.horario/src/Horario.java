public class Horario {

    private int hora;
    private int minutos;

    public Horario(int hora, int minutos) {
        setHora(hora);
        setMinutos(minutos);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }

        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos < 0 || minutos > 59) {
            throw new IllegalArgumentException("Minuto inválido: " + minutos);
        }

        this.minutos = minutos;
    }

    public String formatar() {
       return String.format("%dh%dm", getHora(), getMinutos());
    }
}
