import java.io.File;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {

        // Criando um diretório em Java
        File diretorio = new File("C:\\Users\\danillo.caetano\\Documents\\Especialista-Java\\docs");
        System.out.printf("Diretório criado: %b%n", diretorio.mkdir());

        // Cria diretorio e subdiretorios
        File diretorio2 = new File("C:\\Users\\danillo.caetano\\Documents\\Especialista-Java\\fotos\\casamento");
        System.out.printf("Subdiretórios criados: %b%n", diretorio2.mkdirs());

        // Cria arquivo txt
        File arquivo = new File("C:\\Users\\danillo.caetano\\Documents\\Especialista-Java\\docs\\lista-tarefas.txt");
        try {
            System.out.printf("Arquivo criado: %b%n", arquivo.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException("ERRO: Arquivo não pode ser criado.");
        }


    }

}
