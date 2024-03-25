package com.algaworks.banco;

import com.algaworks.banco.negocio.ContaCorrente;
import com.algaworks.banco.negocio.SaldoInsuficienteException;
import com.algaworks.banco.negocio.Titular;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    private static final Logger LOGGER = Logger.getLogger(Principal.class.getName());

    public static void main(String[] args) {
        var titular = new Titular("João", "12312312399");
        var contaCorrente = new ContaCorrente(titular, 100, 9999);

        try {
            contaCorrente.depositar(new BigDecimal("200"));
            contaCorrente.sacar(new BigDecimal("50.5"));
            contaCorrente.sacar(new BigDecimal("300"));
        } catch (SaldoInsuficienteException e) {
            LOGGER.log(Level.WARNING, String.format("Valor insuficiente para saque. Dados bancários: "
                    + contaCorrente.getAgencia() + "/" + contaCorrente.getNumero()), e);
        } catch (IllegalArgumentException e) {
            LOGGER.log(Level.WARNING, "O valor do saque deve ser maior que 0", e);
        }
    }

}
