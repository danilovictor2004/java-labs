import java.io.*;

public class Principal2 {

    public static void main(String[] args) {
        File file = new File("docs\\lista-tarefas.txt");

        try (InputStream inputStream = new FileInputStream(file)) {
            int byteLidos;

            while ((byteLidos = inputStream.read()) != -1) {
                System.out.print((char) byteLidos);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }

}
