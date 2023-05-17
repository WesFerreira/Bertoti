package br.com.wesley.loja.composite;

public class Main {
    public static void main(String[] args) {
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Component leaf3 = new Leaf();

        Composite composite = new Composite();
        composite.addComponent(leaf1);
        composite.addComponent(leaf2);

        Composite composite2 = new Composite();
        composite2.addComponent(leaf3);
        composite2.addComponent(composite);

        composite2.operation();
    }
}
