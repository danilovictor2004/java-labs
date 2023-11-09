import model.Holerite;
import model.OrdemServico;
import pagamento.Beneficiario;
import pagamento.Pix;
import pagamento.Transferencia;
import servico.ServicoContaPagar;

public class Principal {
    public static void main(String[] args) {

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(new Pix());

        Beneficiario beneficiario = new Beneficiario("João da Silva", "1234567", "1234");
        Holerite holerite = new Holerite(beneficiario, 100, 160);

        ServicoContaPagar servicoContaPagar1 = new ServicoContaPagar(new Transferencia());
        Beneficiario beneficiario1 = new Beneficiario("Consultoria XYZ", "123455555577", "01456");
        OrdemServico os = new OrdemServico(beneficiario1, 50000);

        servicoContaPagar.pagar(holerite);
        servicoContaPagar1.pagar(os);

    }

}
