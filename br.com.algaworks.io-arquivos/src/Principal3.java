import java.io.*;
import java.nio.Buffer;

public class Principal3 {

    public static void main(String[] args) {

        File file = new File("docs\\lista-tarefas.txt");
        StringBuilder texto = new StringBuilder();

        try (Reader reader = new FileReader(file)) {
            char[] caracter = new char[1000];
            int quantidadeCaracter;

            while((quantidadeCaracter = reader.read(caracter)) > 0) {
                texto.append(caracter, 0, quantidadeCaracter);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }

        System.out.println(texto);

    }

}
