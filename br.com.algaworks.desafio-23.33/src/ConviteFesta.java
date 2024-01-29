import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class ConviteFesta {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATADOR_HORARIO = DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter FORMATADOR_COMPLETO = DateTimeFormatter
            .ofPattern("dd 'de' MMMM 'de' yyyy 'às' HH:mm (zzzz)")
            .withLocale(new Locale("pt", "BR"));

    private static LocalDate requisitarData() {
        while (true) {
            try {
                System.out.print("Local data da festa: ");
                String dataTexto = ENTRADA.nextLine();

                return LocalDate.parse(dataTexto, FORMATADOR_DATA);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente");
            }
        }
    }

    private static LocalTime requisitarHora() {
        while (true) {
            try {
                System.out.print("Hora da festa: ");
                String horaTexto = ENTRADA.nextLine();

                return LocalTime.parse(horaTexto, FORMATADOR_HORARIO);
            } catch (DateTimeParseException e) {
                System.out.println("Horário inválido. Tente novamente.");
            }
        }
    }

    public void gerarConvite() {
        LocalDate dataLocalFesta = requisitarData();
        LocalTime horaFesta = requisitarHora();

        ZonedDateTime dataFestaFusoPadrao = dataLocalFesta.atTime(horaFesta)
                .atZone(ZoneId.systemDefault());
        ZonedDateTime dataFestaFusoSaoPaulo = dataFestaFusoPadrao
                .withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime dataFestaFusoLosAngeles = dataFestaFusoPadrao
                .withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        ZonedDateTime dataFestaFusoJapao = dataFestaFusoPadrao
                .withZoneSameInstant(ZoneId.of("Japan"));

        System.out.println(dataFestaFusoSaoPaulo.format(FORMATADOR_COMPLETO));
        System.out.println(dataFestaFusoLosAngeles.format(FORMATADOR_COMPLETO));
        System.out.println(dataFestaFusoJapao.format(FORMATADOR_COMPLETO));
    }

}
