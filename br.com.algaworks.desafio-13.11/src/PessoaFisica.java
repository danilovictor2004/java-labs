public class PessoaFisica extends Pessoa {

    public final double RECEITA_ANUAL_ISENCAO = 50000;
    public final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

    private double receitaAnual;

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }

    @Override
    public double calcularImpostos() {
        if (getReceitaAnual() <= RECEITA_ANUAL_ISENCAO) {
            return 0;
        }

        return getReceitaAnual() * ALIQUOTA_IMPOSTO_RENDA;
    }
}
