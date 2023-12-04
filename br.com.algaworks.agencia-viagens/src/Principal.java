import agencia.CadastroHotel;
import agencia.Hotel;

public class Principal {

    public static void main(String[] args) {

        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar(new Hotel("Jaguaribe Lodge", "Fortim/CE", 1300));
        cadastro.adicionar(new Hotel("Vila Selvagem", "Fortim/CE", 1400));
        cadastro.adicionar(new Hotel("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200));
        cadastro.adicionar(new Hotel("Tivoli Ecoresort", "Praia do Forte/BA", 2000));
        cadastro.adicionar(new Hotel("Mercure", "Uberlândia", 400));

        Hotel hotel = (Hotel) cadastro.obterTodos().get(1);
        System.out.println(hotel.getNome());

    }

}
