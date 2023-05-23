package br.com.wesley.loja.loja;

public class Computador {

    private Eletronicos lojaEletronicos = new Eletronicos("Wesley Eletronicos", "Rua Ferreira");

    public Computador(Eletronicos lojaEletronicos) {
        super();
        this.lojaEletronicos = lojaEletronicos;
    }

    public Eletronicos getLoja() {
        return lojaEletronicos;
    }

    public void setLoja(Eletronicos lojaEletronicos) {
        this.lojaEletronicos = lojaEletronicos;
    }

    public void setModeloComputador() {
        lojaEletronicos.setModelo("DELL i3");
    }
    public void setPrecoComputador() {
        lojaEletronicos.setPreco(5.000);
    }

}
