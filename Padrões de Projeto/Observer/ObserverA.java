package br.com.wesley.loja.observer;

public class ObservadorA implements Observer {
    private Sujeito sujeito;

    public ObservadorA(Sujeito sujeito) {
        this.sujeito = sujeito;
        this.sujeito.adicionarObservador(this);
    }

    @Override
    public void atualizar() {
        System.out.println("ObservadorA recebeu a notificação. Novo estado: " + sujeito.getEstado());
    }
}
