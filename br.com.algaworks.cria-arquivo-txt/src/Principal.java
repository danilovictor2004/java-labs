import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\danillo.caetano\\Desktop\\teste.txt");

        try {
            Path files = Files.createFile(path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
