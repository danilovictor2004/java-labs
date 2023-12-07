import agencia.CadastroHotel;
import agencia.Hotel;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar(new Hotel("Jaguaribe Lodge", "Fortim/CE", 1300));
        cadastro.adicionar(new Hotel("Vila Selvagem", "Fortim/CE", 1400));
        cadastro.adicionar(new Hotel("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200));
        cadastro.adicionar(new Hotel("Tivoli Ecoresort", "Praia do Forte/BA", 2000));
        cadastro.adicionar(new Hotel("Mercure", "Uberlândia", 400));
        //cadastro.adicionar(new Hotel("Jaguaribe Lodge", "Fortim/CE", 1300));

        List<Hotel> hoteis = cadastro.obterTodos();
        imprimirHoteis(hoteis);
        System.out.println();

        cadastro.remover(new Hotel("Tivoli Ecoresort", "Praia do Forte/BA", 0));
        imprimirHoteis(hoteis);
        System.out.println();

        cadastro.removerPorCidade("Fortim/CE");
        imprimirHoteis(hoteis);
        System.out.println();

        cadastro.removerTodos();
        imprimirHoteis(hoteis);

    }

    private static void imprimirHoteis(List<Hotel> hoteis) {
        for (Hotel hotel : hoteis) {
            System.out.printf("%s (%s) -> %.2f%n",
                    hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }

}
