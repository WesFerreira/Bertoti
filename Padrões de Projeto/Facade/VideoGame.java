package br.com.wesley.loja.loja;

public class VideoGame {

    private Eletronicos lojaEletronicos = new Eletronicos("Wesley Eletronicos", "Rua Ferreira");

    public VideoGame(Eletronicos lojaEletronicos) {
        super();
        this.lojaEletronicos = lojaEletronicos;
    }

    public Eletronicos getLoja() {
        return lojaEletronicos;
    }

    public void setLoja(Eletronicos lojaEletronicos) {
        this.lojaEletronicos = lojaEletronicos;
    }

    public void setModeloVideoGame() {
        lojaEletronicos.setModelo("Play Station 5");
    }
    public void setPrecoVideoGame() {
        lojaEletronicos.setPreco(5.000);
    }

}
