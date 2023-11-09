package servico;

import pagamento.Beneficiario;
import pagamento.DocumentoPagavel;
import pagamento.MetodoPagamento;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento) {
        metodoPagamento.pagar(documento);
    }

}
