import domain.Venda;
import repository.VendaRepository;
import services.CadastroVendaServices;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        final String url = "jdbc:mysql://localhost:3306/comercial";
        final String user = "root";
        final String password = "123456";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {

            VendaRepository vendaRepository = new VendaRepository(connection);
            CadastroVendaServices services = new CadastroVendaServices(vendaRepository);

            Venda vendaCadastrada = services.cadastrar("Murilo",
                    new BigDecimal("100000.87"), LocalDate.parse("2023-04-19"));

            System.out.println("Venda realizada: " + vendaCadastrada);

            var listarTodos = vendaRepository.listar();
            listarTodos.forEach(System.out::println);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
