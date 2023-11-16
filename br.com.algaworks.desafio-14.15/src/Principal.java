import Model.ImovelResidencial;
import Services.ServicoPropostaSeguro;

public class Principal {

    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();
        ImovelResidencial imovel = new ImovelResidencial(2300000, 320);
        servicoPropostaSeguro.emitir(imovel);
    }

}
