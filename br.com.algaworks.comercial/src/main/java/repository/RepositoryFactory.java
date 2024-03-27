package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RepositoryFactory implements AutoCloseable{

    private final Connection connection;

    public RepositoryFactory() {
        String password = "123456";
        String url = "jdbc:mysql://localhost:3306/comercial";
        String user = "root";

        try {
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public VendaRepository criarVendaRepositorio() {
        return new VendaRepository(connection);
    }

    @Override
    public void close() throws Exception {
        connection.close();
    }
}
