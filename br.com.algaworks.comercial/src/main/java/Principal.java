import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Principal {

    public static void main(String[] args) {
        final DateTimeFormatter DATA_FORMATADOR = DateTimeFormatter.
                ofPattern("dd/MM/yyyy", new Locale("pt-BR", "BR"));

        try (Connection conexao = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/comercial", "root", "123456");
             Statement stm = conexao.createStatement()) {

            ResultSet rs = stm.executeQuery("SELECT * FROM venda");

            while (rs.next()) {
                Long id = rs.getLong("id");
                String nomeCliente = rs.getString("nome_cliente");
                BigDecimal valorTotal = rs.getBigDecimal("valor_total");
                Date data_pagamento = rs.getDate("data_pagamento");
                String dataLocal = data_pagamento.toLocalDate().format(DATA_FORMATADOR);

                System.out.printf("%d - %s - R$%.2f - %s%n",
                        id, nomeCliente, valorTotal, dataLocal);

            }

        } catch (SQLException e) {
            System.out.println("Erro de conexão");
            e.printStackTrace();
        }
    }

}
