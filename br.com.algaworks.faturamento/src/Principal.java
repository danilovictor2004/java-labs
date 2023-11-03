public class Principal {

    public static void main(String[] args) {

        var gestorFiscal = new GestorFiscal();

        var nfBolaFutebol = new NotaFiscalProduto("Bola de Futebol", 300,50);
        var nfReparoMotor = new NotaFiscalServico("Reparo de motor", 900,true);

        gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);

    }

}
