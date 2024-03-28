package repository;

import domain.Venda;
import exceptions.NegocioExceptions;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VendaRepository {

    private final Connection connection;

    public VendaRepository(Connection connection) {
        this.connection = connection;
    }

    public Venda adicionar(Venda venda) {
        String dml = """
                    INSERT INTO venda (nome_cliente, valor_total, data_pagamento)
                    VALUES (?,?,?)
                """;

        try (PreparedStatement statement = connection.prepareStatement(dml, Statement.RETURN_GENERATED_KEYS)) {

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

    public List<Venda> listar() {
        List<Venda> vendas = new ArrayList<>();
        String sql = "SELECT * FROM venda";

        try (Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Long id = rs.getLong("id");
                String nomeCliente = rs.getString("nome_cliente");
                BigDecimal valorTotal = rs.getBigDecimal("valor_total");
                Date dataPagamento = rs.getDate("data_pagamento");

                Venda venda = new Venda (id, nomeCliente, valorTotal, dataPagamento.toLocalDate());
                vendas.add(venda);
            }

            return vendas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public Venda consultarVendaId(Long id) {
        String sql = "SELECT * FROM venda WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, id);

            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                id = rs.getLong("id");
                String nomeCliente = rs.getString("nome_cliente");
                BigDecimal valorTotal = rs.getBigDecimal("valor_total");
                Date dataPagamento = rs.getDate("data_pagamento");

                return new Venda(id, nomeCliente, valorTotal, dataPagamento.toLocalDate());
            }

            throw new RuntimeException("Código não localizado");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteVendaPorId(Long id) {
        String sql = """
                        DELETE FROM venda
                         WHERE id = ?;
                     """;

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Registro não existe.", e);
        }
    }

}
