package DIP;

public class NotificacaoWhatsapp implements Notificacao {
    public void enviarNotificacao(String mensagem) {
        System.out.println("Notificação Enviada por WhatsApp!");
    }
}
