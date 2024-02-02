import crm.CadastroCliente;
import crm.Cliente;

import java.util.List;

public class Principal {

    public static void main(String[] args) {

        var cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("João", 30));
        cadastroCliente.adicionar(new Cliente("Maria", 90));
        cadastroCliente.adicionar(new Cliente("Sebastião", 50));
        cadastroCliente.adicionar(new Cliente("Joaquim", 45));
        cadastroCliente.adicionar(new Cliente("Josefina", 25));

        // Expressão lambda
        List<Cliente> clientes = cadastroCliente.consultar(cliente -> cliente.idade() > 40);

        // Ordena clientes por idade
        clientes.sort((cliente1, cliente2) -> Integer.compare(cliente1.idade(), cliente2.idade()));

        for(Cliente cliente : clientes) {
            System.out.printf("%s - %d%n", cliente.nome(), cliente.idade());
        }

    }

}
