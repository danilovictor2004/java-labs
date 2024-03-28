package repository;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class RepositoryFactory implements AutoCloseable{

    private final Connection connection;

    public RepositoryFactory() {

        try (var is = RepositoryFactory.class.getResourceAsStream("/app.properties")) {
            Properties properties = new Properties();
            properties.load(is);

            String url = properties.getProperty("connection.url");
            String user = properties.getProperty("connection.user");
            String password = properties.getProperty("connection.password");

            try {
                this.connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
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
