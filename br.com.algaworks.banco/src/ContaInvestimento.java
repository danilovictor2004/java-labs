public class ContaInvestimento extends Conta{

    private double valorTotalRendimento;

    public ContaInvestimento(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public double getValorTotalRendimento() {
        return valorTotalRendimento;
    }

    public void creditarRendimento(double percentualJuros) {
        double valorRendimento = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimento += valorRendimento;
        depositar(valorRendimento);
    }

}
