import Model.Carro;
import Model.Proprietario;

import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {

        Proprietario maria = new Proprietario("Maria", "11111111111");
        Proprietario ana = new Proprietario("Ana", "22222222222");
        Proprietario jose = new Proprietario("José", "33333333333");
        Proprietario joao = new Proprietario("João", "44444444444");

        Carro bmw = new Carro("ALG1A23", "BMW X3");
        Carro honda = new Carro("WOR9K87", "Honda HR-V");
        Carro ford = new Carro("JAV5A67", "Ford Ka");
        Carro porsche = new Carro("EJA0V44", "Porsche 911");

        // Adiciona registros no mapa
        Map<Carro, Proprietario> proprietarios = new HashMap<>();
        proprietarios.put(bmw, maria);
        proprietarios.put(honda, ana);
        proprietarios.put(ford, jose);
        proprietarios.put(porsche, maria);

        // Iterar e exibir os registros no Map
        for (var entry : proprietarios.entrySet()) {
            System.out.printf("%s (%s) = %s%n", entry.getKey().getPlaca(),
                    entry.getKey().getModelo(), entry.getValue().getNome());
        }

        // Remove o valor do mapa
        proprietarios.remove(ford);
        System.out.println();

        // Iterar e exibir os registros no Map
        for (var entry : proprietarios.entrySet()) {
            System.out.printf("%s (%s) = %s%n", entry.getKey().getPlaca(),
                    entry.getKey().getModelo(), entry.getValue().getNome());
        }

    }

}
