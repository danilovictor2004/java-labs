import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CalculadoraParcelas {

    private static final DateTimeFormatter FORMATADOR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final Scanner ENTRADA = new Scanner(System.in);

    private LocalDate dataVencimento() {
        while (true) {
            try {
                System.out.print("Data da primeira parcela: ");
                String data = ENTRADA.nextLine();

                return LocalDate.parse(data, FORMATADOR);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente");
            }
        }
    }

    private int totalParcelas() {
        System.out.print("Quantidade de parcelas: ");
        return ENTRADA.nextInt();
    }

    public void gerarParcela() {
        LocalDate date = dataVencimento();
        int parcela = totalParcelas();

        for (long i = 0; i < parcela; i++) {
            System.out.printf("Parcela #%d - %s%n", i + 1,
                    FORMATADOR.format(date.plusMonths(i)));
        }
    }

}
