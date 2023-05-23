package br.com.wesley.loja.loja;

public class Celular {

    private Eletronicos lojaEletronicos = new Eletronicos("Wesley Eletronicos", "Rua Ferreira");

    public Celular(Eletronicos lojaEletronicos) {
        super();
        this.lojaEletronicos = lojaEletronicos;
    }

    public Eletronicos getLoja() {
        return lojaEletronicos;
    }

    public void setLoja(Eletronicos lojaEletronicos) {
        this.lojaEletronicos = lojaEletronicos;
    }

    public void setModeloCelular() {
        lojaEletronicos.setModelo("Iphone 14 PRO");
    }
    public void setPrecoCelular() {
        lojaEletronicos.setPreco(13.000);
    }

}


