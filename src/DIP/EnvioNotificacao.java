package DIP;

public class EnvioNotificacao {
    private Notificacao notificacao;

    public EnvioNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void enviarNotificacao () {
        this.notificacao.enviarNotificacao("video publicado");
    }
}
