import Model.Cliente;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Mercadinho de Mano", 20_000));
        clientes.add(new Cliente("Posto de Gasolina", 100_000));

        double faturamentoTotal = 0;

        for (Cliente cliente : clientes) {
            faturamentoTotal += cliente.getFaturamentoMensal();
        }

        System.out.printf("Faturamento total por mês R$%.2f", faturamentoTotal);

    }

}
