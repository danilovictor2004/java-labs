package services;

import domain.Venda;
import repository.VendaRepository;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CadastroVendaServices {

     VendaRepository vendaReposity = new VendaRepository();

    public Venda cadastrar(String nomeCliente, BigDecimal valorTotal, LocalDate dataPagamento) {
        if (valorTotal.compareTo(BigDecimal.ZERO) <= 0) {
            throw new RuntimeException("Valor total deve ser maior que zero");
        }
        if(dataPagamento.isAfter(LocalDate.now())) {
            throw new RuntimeException("Data do pagamento não pode ser uma data futura");
        }

        return vendaReposity.adicionar(new Venda(nomeCliente, valorTotal, dataPagamento));
    }

}
