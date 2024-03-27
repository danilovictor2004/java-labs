package repository;

import domain.Venda;
import exceptions.NegocioExceptions;

import java.sql.*;

public class VendaRepository {

    private static final String URL = "jdbc:mysql://localhost:3306/comercial";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    public Venda adicionar(Venda venda) {
        String dml = """
                    INSERT INTO venda (nome_cliente, valor_total, data_pagamento)
                    VALUES (?,?,?)
                """;

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(dml, Statement.RETURN_GENERATED_KEYS)) {

            statement.setString(1, venda.getNomeCliente());
            statement.setBigDecimal(2, venda.getValorTotal());
            statement.setDate(3, Date.valueOf(venda.getDataPagamento()));
            statement.executeUpdate();

            ResultSet codigoGeradoResultSet = statement.getGeneratedKeys();
            codigoGeradoResultSet.next();
            Long codigoGerado = codigoGeradoResultSet.getLong(1);

            return new Venda(codigoGerado, venda.getNomeCliente(), venda.getValorTotal(), venda.getDataPagamento());
        } catch (SQLException e) {
            throw new NegocioExceptions(e);
        }
    }

}
