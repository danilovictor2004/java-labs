import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private static final DateFormat FORMATADOR_DATA = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Data da primeira parcela: ");
        String dataParcelaTexto = scanner.nextLine();

        System.out.print("Quantidade de parcelas: ");
        int quantidadeParcelas = scanner.nextInt();

        Date dataParcela = FORMATADOR_DATA.parse(dataParcelaTexto);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataParcela);

        CalculadoraParcelas calculadora = new CalculadoraParcelas();
        List<Date> datasParcelas = calculadora.calcular(dataParcela, quantidadeParcelas);

        imprimirParcelas(datasParcelas);

        scanner.close();

    }

    private static void imprimirParcelas(List<Date> datasParcelas) {
        for (int i = 0; i < datasParcelas.size(); i++) {
            System.out.printf("Parcela #%d - %s%n", i+1,
                    FORMATADOR_DATA.format(datasParcelas.get(i)));
        }
    }

}
