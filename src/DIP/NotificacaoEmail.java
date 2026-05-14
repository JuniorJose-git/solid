package DIP;

public class NotificacaoEmail implements Notificacao {
    public void enviarNotificacao(String mensagem){
        System.out.println("Notificação Enviada por Email!");
    };
}
