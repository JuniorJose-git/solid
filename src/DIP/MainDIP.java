package DIP;

public class MainDIP {
    static void main() {

        Notificacao notificacaoWhatsapp = new NotificacaoWhatsapp();
        Notificacao notificacaoEmail = new NotificacaoEmail();
        Notificacao notificacaoSMS = new NotificacaoSMS();

        EnvioNotificacao envioNotificacao1 = new EnvioNotificacao(notificacaoWhatsapp);
        EnvioNotificacao envioNotificacao2 = new EnvioNotificacao(notificacaoEmail);
        EnvioNotificacao envioNotificacao3 = new EnvioNotificacao(notificacaoSMS);

        envioNotificacao1.enviarNotificacao();
        envioNotificacao2.enviarNotificacao();
        envioNotificacao3.enviarNotificacao();

    }
}
