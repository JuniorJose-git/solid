package OCP;

public class PagamentoDinheiro extends Pagamento {
    @Override
    public void RealizarPagamento(int valor) {
        System.out.println("Pagamento feito em dinheiro no valor de " + valor + " reais");
    }
}
