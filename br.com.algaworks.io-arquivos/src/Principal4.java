import java.io.*;

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

        // Ler o arquivo texto
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado.", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }

    }

}
