package swing.modelo;

public class Usuario {
    private String tema;
    private boolean notificacoes;
    private int volume;

    public Usuario() {
        this.tema = "Claro";
        this.notificacoes = false;
        this.volume = 50;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public boolean isNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(boolean notificacoes) {
        this.notificacoes = notificacoes;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String exibirPreferencias() {
        return "Tema: " + tema +
               "\nNotificações: " + (notificacoes ? "Ativadas" : "Desativadas") +
               "\nVolume: " + volume;
    }
}