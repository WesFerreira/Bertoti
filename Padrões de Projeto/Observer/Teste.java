package br.com.wesley.loja.observer;

public class Teste {

    public class Main {
        public static void main(String[] args) {
            Sujeito sujeito = new Sujeito();

            ObservadorA observadorA = new ObservadorA(sujeito);
            ObservadorB observadorB = new ObservadorB(sujeito);

            sujeito.setEstado(1); // Notifica os observadores sobre a mudança de estado
            sujeito.setEstado(2); // Notifica os observadores novamente sobre a mudança de estado

            sujeito.removerObservador(observadorB);

            sujeito.setEstado(3); // Apenas o ObservadorA recebe a notificação
        }
    }

}
