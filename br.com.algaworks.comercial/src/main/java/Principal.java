import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Principal {

    public static void main(String[] args) {
        try (Connection conexao = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/comercial", "root", "123456")) {
            System.out.println("Conexão aberta");
        } catch (SQLException e) {
            System.out.println("Erro de conexão");
            e.printStackTrace();
        }
    }

}
