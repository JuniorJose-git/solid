package SRP;

public class PedidoRelatorio {
    public void exibir(Pedido pedido) {
        System.out.println("O cliente do meu pedido é: " + pedido.getCliente());
        System.out.println("O item do meu pedido é: " + pedido.getItem());
    }
}
