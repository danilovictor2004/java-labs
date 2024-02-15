public class Principal {

    public static void main(String[] args)  {
        var servicoDeReserva = new ServicoDeReserva();
        var servicoDeBagagens = new ServicoDeBagagem(servicoDeReserva);
        var voo = new Voo("631333", "MCZ", "GRU");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da Silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da Silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho"));

        try {
            servicoDeBagagens.contratar("28BXXX", 2);
            servicoDeReserva.getReservas().forEach(System.out::println);
        } catch (Reserva.ReservaNaoEncontradaException e) {
            e.printStackTrace();
        }
    }

}
