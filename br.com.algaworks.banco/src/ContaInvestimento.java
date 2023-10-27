public class ContaInvestimento extends Conta{

    private double valorTotalRendimento;

    public double getValorTotalRendimento() {
        return valorTotalRendimento;
    }

    public void creditarRendimento(double percentualJuros) {
        double valorRendimento = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimento += valorRendimento;
        depositar(valorRendimento);
    }

}
