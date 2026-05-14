package OCP;

public class MainOCP {
    static void main() {

        Pagamento pagamentoPix = new PagamentoPix();
        pagamentoPix.RealizarPagamento(10);

        Pagamento pagamentoCartao = new PagamentoCartao();
        pagamentoCartao.RealizarPagamento(20);

        Pagamento pagamentoDinheiro = new PagamentoDinheiro();
        pagamentoDinheiro.RealizarPagamento(30);

    }
}
