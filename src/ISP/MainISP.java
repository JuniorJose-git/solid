package ISP;

public class MainISP {
    public void main () {
        EntregasImp entregasImp = new EntregasImp();
        entregasImp.realizarEntrega();

        NotificacoesImp notificacoesImp = new NotificacoesImp();
        notificacoesImp.enviarNotificacao();

        PedidosImp pedidosImp = new PedidosImp();
        pedidosImp.realizarPedido();

        RelatoriosImp relatoriosImp = new RelatoriosImp();
        relatoriosImp.gerarRelatorio();

    }
}
