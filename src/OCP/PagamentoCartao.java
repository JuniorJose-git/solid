package OCP;

public class PagamentoCartao extends Pagamento{
    @Override
    public void RealizarPagamento(int valor) {
        System.out.println("Pagamento realizado via cartão no valor de " + valor + " reais");
    }
}
