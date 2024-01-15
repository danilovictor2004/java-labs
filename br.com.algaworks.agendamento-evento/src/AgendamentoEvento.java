import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class AgendamentoEvento {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATADOR_HORARIO = DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter FORMATADOR_COMPLETO_BRASIL = DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
            .withLocale(new Locale("pt", "BR"));

    public static void main(String[] args) {

    }

    private static LocalDate requisitarData(String descricao) {
        while (true) {
            try {
                System.out.print(descricao);
                String dataTexto = ENTRADA.nextLine();
                ENTRADA.close();

                return LocalDate.parse(dataTexto, FORMATADOR_DATA);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }
    }

    private static LocalDate requisitarHora(String descricao) {
        while (true) {
            try {
                System.out.print(descricao);
                String horarioTexto = ENTRADA.nextLine();

                return LocalDate.parse(horarioTexto, FORMATADOR_HORARIO);
            } catch (DateTimeParseException e) {
                System.out.println("Horário inválido. Tente novamente.");
            }
        }
    }

}