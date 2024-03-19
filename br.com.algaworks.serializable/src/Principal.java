import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Danillo",
                LocalDate.of(1991, Month.FEBRUARY, 10), new BigDecimal("4500"));

        Path path = Path.of("objetos/danillo.ser");

        try (var outputStream = new ObjectOutputStream(Files.newOutputStream(path, WRITE, CREATE))) {
            outputStream.writeObject(funcionario);
            System.out.println("Serialização concluída.");
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }

}
