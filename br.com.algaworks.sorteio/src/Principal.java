import Model.Cliente;
import Model.Sorteador;

public class Principal {

    public static void main(String[] args) {

        String[] nomes = {"Danillo", "José", "Maria", "João"};
        String nomeSorteado = Sorteador.sortear(nomes);
        System.out.println(nomeSorteado);

        Cliente[] clientes = {
                new Cliente("Supermercado Pague e Leve", 2_000_000),
                new Cliente("Posto Gasolina Boa", 800_000),
                new Cliente("Javac Consultoria", 50_000_000)
        };

        Cliente clienteSorteado = Sorteador.sortear(clientes);
        System.out.println(clienteSorteado.getRazaoSocial());

    }

}
