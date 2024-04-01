package csv;

import crm.entidade.Cliente;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class GeradorCSV {

    public static <T> void imprimir(List<Cliente> objetos) {
        Field[] field =  Cliente.class.getDeclaredFields();

        System.out.println(Arrays.stream(field)
                .map(Field::getName)
                .collect(Collectors.joining(";")));

        objetos.forEach(GeradorCSV::imprimir);
    }

    private static void imprimir(Cliente cliente) {
        Field[] field = cliente.getClass().getDeclaredFields();
        List<String> valores = new ArrayList<>();

        try {
            for (Field field1 : field) {
                field1.setAccessible(true);
                Object objects = field1.get(cliente);
                valores.add(objects == null ? "" : objects.toString());
            }

            System.out.println(String.join(";", valores));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}