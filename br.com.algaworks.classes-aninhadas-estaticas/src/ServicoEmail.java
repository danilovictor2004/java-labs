public class ServicoEmail {

    public void enviar(Mensagem mensagem) {
        System.out.printf("Enviando de %s para %s: %s%n",
                mensagem.remetente(), mensagem.destinatario(), mensagem.texto());
    }

    public static String gerarAssinatura() {
        return "\n--\nJoão";
    }

    public record Mensagem(String remetente, String destinatario, String texto) {

        @Override
        public String texto() {
                return texto + gerarAssinatura();
            }

    }

}
