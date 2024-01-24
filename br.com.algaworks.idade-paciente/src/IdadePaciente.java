import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class IdadePaciente {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {

    }

    private static LocalDate requisitarData(String descricao) {
        while (true) {
            try {
                System.out.print(descricao);
                String dataTexto = ENTRADA.nextLine();

                return LocalDate.parse(dataTexto, FORMATADOR_DATA);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválido. Tente novamente.");
            }
        }
    }

}
