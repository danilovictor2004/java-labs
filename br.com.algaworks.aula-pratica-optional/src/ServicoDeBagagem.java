import java.util.Objects;
import java.util.Optional;

public class ServicoDeBagagem {

    private ServicoDeReserva servicoDeReserva;

    public ServicoDeBagagem(ServicoDeReserva servicoDeReserva) {
        Objects.requireNonNull(servicoDeReserva);
        this.servicoDeReserva = servicoDeReserva;
    }

    public void contratar(String codigoReserva, int quantidadeBagagens) throws Reserva.ReservaNaoEncontradaException {
        if (quantidadeBagagens <= 0) {
            throw new IllegalArgumentException("Quantidade de bagagens inválida.");
        }

        Optional<Reserva> reserva = servicoDeReserva.buscar(codigoReserva);
        reserva.get().adicionarBagagens(quantidadeBagagens);
    }

}
