package OCP;

public class PagamentoPix extends Pagamento {
    @Override
    public void RealizarPagamento(int valor) {
        System.out.println("Pagamento realizado via pix no valor de " + valor + " reais");
    }
}
