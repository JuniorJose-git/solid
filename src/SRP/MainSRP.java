package SRP;

public class MainSRP {
    static void main () {
        Pedido pedido = new Pedido("joao", "pizza");

        PedidoRepository pedidoRepository = new PedidoRepository();
        pedidoRepository.salvar(pedido);

        PedidoRelatorio pedidoRelatorio = new PedidoRelatorio();

        pedidoRelatorio.exibir(pedido);

    }
}
