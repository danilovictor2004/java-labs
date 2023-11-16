package Model;

public class ImovelResidencial implements BemSeguravel {

    public static final double PORCENTAGEM_VALOR_MERCADO = 0.001;
    public static final double VALOR_ACRESCIMO_AREA_CONSTRUIDA = 0.3;
    private double valorMercado;
    private int AreaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        AreaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public int getAreaConstruida() {
        return AreaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * PORCENTAGEM_VALOR_MERCADO) + (VALOR_ACRESCIMO_AREA_CONSTRUIDA * getAreaConstruida());
    }

    @Override
    public String descrever() {
        return String.format("Imóvel residencial com %dm2 de área construída, avaliado em R$%.2f%n",
                getAreaConstruida(), getValorMercado());
    }
}
