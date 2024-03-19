import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;

import static java.nio.file.StandardOpenOption.*;

public class Principal {

    public static void main(String[] args) throws RuntimeException {
        Funcionario funcionario = new Funcionario("Danillo",
                LocalDate.of(1991, Month.FEBRUARY, 10), new BigDecimal("4500"));

        Path path = Path.of("objetos/danillo.ser");

        // Serializando o arquivo
        try (var outputStream = new ObjectOutputStream(Files.newOutputStream(path, WRITE, CREATE))) {
            outputStream.writeObject(funcionario);
            System.out.println("Serialização concluída.");
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }

        // Desserializando o arquivo
        try (var inputStream = new ObjectInputStream(Files.newInputStream(path, READ))) {
            Funcionario funcionario1 = (Funcionario) inputStream.readObject();
            System.out.println("Arquivo desserializado.");
            System.out.println(funcionario1);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O.", e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Classe não encontrada", e);
        }

    }

}
