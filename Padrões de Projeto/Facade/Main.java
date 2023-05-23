package br.com.wesley.loja.loja;

public class Main {

    public static void main(String args[]) {

        Eletronicos loja = new Eletronicos("Wesley Eletronicos", "Rua Ferreira");
        Computador computador = new Computador(loja);
        Celular celular = new Celular(loja);
        VideoGame videoGame = new VideoGame(loja);

        computador.setPrecoComputador();
        computador.setModeloComputador();

        celular.setPrecoCelular();
        celular.setModeloCelular();

        videoGame.setPrecoVideoGame();
        videoGame.setModeloVideoGame();

    }
}
