package br.com.wesley.loja.observer;

public class ObservadorB implements Observer {
    private Sujeito sujeito;

    public ObservadorB(Sujeito sujeito) {
        this.sujeito = sujeito;
        this.sujeito.adicionarObservador(this);
    }

    @Override
    public void atualizar() {
        System.out.println("ObservadorB recebeu a notificação. Novo estado: " + sujeito.getEstado());
    }
}
