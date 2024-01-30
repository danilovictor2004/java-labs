public class Principal {

    public static void main(String[] args) {
        ServicoEmail servicoEmail = new ServicoEmail();

        ServicoEmail.Mensagem mensagem = new ServicoEmail.Mensagem("joao@email.com",
                "jose@email.com", "Oi primo! Vamos jogar bola?");

        servicoEmail.enviar(mensagem);
    }

}
