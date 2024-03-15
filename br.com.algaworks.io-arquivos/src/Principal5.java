import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal5 {

    public static void main(String[] args) {
        Path pasta = Path.of("docs\\contrato.txt");

        if (!Files.exists(pasta)) {
            try {
                Files.createFile(pasta);
                System.out.println("Arquivo criado.");
            } catch (IOException e) {
                throw new RuntimeException("Erro ao criar o arquivo", e);
            }
        }

    }

}
