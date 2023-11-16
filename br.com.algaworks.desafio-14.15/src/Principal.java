import Model.Caminhao;
import Model.CarroParticular;
import Model.ImovelResidencial;
import Services.ServicoPropostaSeguro;

public class Principal {

    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        ImovelResidencial imovel = new ImovelResidencial(2300000, 320);
        CarroParticular carroParticular = new CarroParticular("HR-V", 2022, 150000);
        Caminhao caminhao = new Caminhao("Actros", 2021, 780_000, 4);

        servicoPropostaSeguro.emitir(imovel);
        servicoPropostaSeguro.emitir(carroParticular);
        servicoPropostaSeguro.emitir(caminhao);
    }

}
