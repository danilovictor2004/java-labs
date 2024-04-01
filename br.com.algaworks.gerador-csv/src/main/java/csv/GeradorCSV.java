package csv;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GeradorCSV {

    public static <T> void imprimir(Class<T> clazz, List<T> objetos) {
        Field[] field =  clazz.getDeclaredFields();

        System.out.println(Arrays.stream(field)
                .map(Field::getName)
                .collect(Collectors.joining(";")));

        objetos.forEach(GeradorCSV::imprimir);
    }

    private static void imprimir(Object cliente) {
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