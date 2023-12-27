public class Principal {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setStatus(StatusPedido.EMITIDO);
        pedido.setOrigem(OrigemPedido.ONLINE);

        System.out.printf("Pedido%nStatus %s -> Tempo de entrega: %dh%n", pedido.getStatus(),
                pedido.getTempoEntregaEmHoras());
        System.out.println(pedido.getOrigem());
    }

}
