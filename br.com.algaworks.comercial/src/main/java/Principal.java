import domain.Venda;
import services.CadastroVendaServices;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Principal {

    public static void main(String[] args) {
        CadastroVendaServices services = new CadastroVendaServices();
        Venda vendaCadastrada = services.cadastrar("José da Silva",
                new BigDecimal("12300.87"), LocalDate.parse("2023-04-19"));

        System.out.println(vendaCadastrada);
    }

}
