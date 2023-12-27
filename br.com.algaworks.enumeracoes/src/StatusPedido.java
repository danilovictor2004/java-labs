public enum StatusPedido {

    RASCUNHO,
    EMITIDO(12),
    FATURADO(8),
    DESPACHADO(6),
    ENTREGUE(0),
    CANCELADO;

    private int tempoEntregaPedido;

    StatusPedido() {
    }

    StatusPedido(int tempoEntregaPedido) {
        this.tempoEntregaPedido = tempoEntregaPedido;
    }

    public int getTempoEntregaPedido() {
        return tempoEntregaPedido;
    }
}
