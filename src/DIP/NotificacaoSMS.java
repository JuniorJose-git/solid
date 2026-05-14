package DIP;

public class NotificacaoSMS implements Notificacao {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Notificação Enviada por SMS!");
    }
}
