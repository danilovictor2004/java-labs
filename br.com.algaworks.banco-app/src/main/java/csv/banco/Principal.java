package csv.banco;

import csv.banco.negocio.ContaCorrente;
import csv.banco.negocio.SaldoInsuficienteException;
import csv.banco.negocio.Titular;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class Principal {

    private static final Logger LOGGER = LoggerFactory.getLogger(Principal.class);

    public static void main(String[] args) {
        var titular = new Titular("João", "12312312399");
        var contaCorrente = new ContaCorrente(titular, 100, 9999);

        try {
            contaCorrente.depositar(new BigDecimal("200"));
            contaCorrente.sacar(new BigDecimal("50.5"));
            contaCorrente.sacar(new BigDecimal("300"));
        } catch (SaldoInsuficienteException e) {
            LOGGER.warn("Valor insuficiente para saque. Dados bancários: "
                    + contaCorrente.getAgencia() + "/" + contaCorrente.getNumero(), e);
        } catch (IllegalArgumentException e) {
            LOGGER.warn("O valor do saque deve ser maior que 0", e);
        }
    }

}
