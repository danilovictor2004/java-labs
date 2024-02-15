import java.util.Objects;

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

        Reserva reserva = servicoDeReserva.buscar(codigoReserva);

        if (reserva == null) {
            throw new Reserva.ReservaNaoEncontradaException("Reserva não existe.");
        }

        reserva.adicionarBagagens(quantidadeBagagens);
    }

}
