import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Principal4 {

    public static void main(String[] args) {
        String[] nomes = {"Danillo", "Clebiana", "Murilo", "Darllan", "Elenice", "João", "José Miguel"};
        File file = new File("docs\\lista-nomes.txt");

        try (Writer writer = new FileWriter(file)) {
            for (String nome : nomes) {
                writer.write(nome + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }

}
