package br.com.wesley.loja.composite;

public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Executando operação em uma folha");
    }

}
