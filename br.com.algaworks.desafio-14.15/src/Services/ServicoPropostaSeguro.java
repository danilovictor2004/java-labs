package Services;

import Model.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir (BemSeguravel bem) {
        System.out.println("-----------------------");
        System.out.println("Proposta de seguro");
        System.out.println("-----------------------");
        System.out.println(bem.descrever());
    }

}
