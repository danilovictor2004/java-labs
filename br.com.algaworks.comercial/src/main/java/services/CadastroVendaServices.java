package services;

import domain.Venda;
import exceptions.NegocioExceptions;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDate;

public class CadastroVendaServices {

    private static final String URL = "jdbc:mysql://localhost:3306/comercial";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    public Venda cadastrar(String nomeCliente, BigDecimal valorTotal, LocalDate dataPagamento) {
        if (valorTotal.compareTo(BigDecimal.ZERO) <= 0) {
            throw new RuntimeException("Valor total deve ser maior que zero");
        }
        if(dataPagamento.isAfter(LocalDate.now())) {
            throw new RuntimeException("Data do pagamento não pode ser uma data futura");
        }

        String dml = """
                    INSERT INTO venda (nome_cliente, valor_total, data_pagamento)
                    VALUES (?,?,?)
                """;


        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(dml, Statement.RETURN_GENERATED_KEYS)) {

            statement.setString(1, nomeCliente);
            statement.setBigDecimal(2, valorTotal);
            statement.setDate(3, Date.valueOf(dataPagamento));
            statement.executeUpdate();

            ResultSet codigoGeradoResultSet = statement.getGeneratedKeys();
            codigoGeradoResultSet.next();
            Long codigoGerado = codigoGeradoResultSet.getLong(1);

            return new Venda(codigoGerado, nomeCliente, valorTotal, dataPagamento);
        } catch (SQLException e) {
            throw new NegocioExceptions(e);
        }
    }

}
