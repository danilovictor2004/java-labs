import model.Holerite;
import model.OrdemServico;
import pagamento.Beneficiario;
import servico.ServicoContaPagar;

public class Principal {
    public static void main(String[] args) {

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        Beneficiario beneficiario = new Beneficiario("João da Silva", "1234567", "1234");
        Holerite holerite = new Holerite(beneficiario, 100, 160);

        Beneficiario beneficiario1 = new Beneficiario("Consultoria XYZ", "123455555577", "01456");
        OrdemServico os = new OrdemServico(beneficiario1, 50000);

        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(os);

    }

}
