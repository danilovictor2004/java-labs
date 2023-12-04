import agencia.CadastroHotel;
import agencia.Hotel;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar(new Hotel("Jaguaribe Lodge", "Fortim/CE", 1300));
        cadastro.adicionar(new Hotel("Vila Selvagem", "Fortim/CE", 1400));
        cadastro.adicionar(new Hotel("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200));
        cadastro.adicionar(new Hotel("Tivoli Ecoresort", "Praia do Forte/BA", 2000));
        cadastro.adicionar(new Hotel("Mercure", "Uberlândia", 400));

        ArrayList<Hotel> hoteis = cadastro.obterTodos();
        imprimirHoteis(hoteis);

    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }

}
