package SRP;

public class Pedido {

    private String cliente;
    private String item;

    public Pedido(String cliente, String item) {
        this.cliente = cliente;
        this.item = item;
    }

    public String getCliente() {
        return cliente;
    }

    public String getItem() {
        return item;
    }
}
