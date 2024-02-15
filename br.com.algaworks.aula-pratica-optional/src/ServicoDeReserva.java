import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class ServicoDeReserva {

    private final Set<Reserva> reservas = new HashSet<>();

    public Set<Reserva> getReservas() {
        return reservas;
    }

    public void adicionar(Reserva reserva) {
        boolean reservaAdicionada = reservas.add(reserva);

        if (!reservaAdicionada) {
            throw new RuntimeException(String.format("Reserva %s já existe", reserva.getCodigo()));
        }
    }

    public Optional<Reserva> buscar(String codigo) {

        for (Reserva reserva : reservas) {
            if (reserva.getCodigo().equals(codigo)) {
                return Optional.of(reserva);
            }
        }

        return Optional.empty();
    }
}
