package br.com.wesley.loja.composite;

import java.util.ArrayList;
import java.util.List;

public interface Component {

    void operation();

}

class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Executando operação em uma folha");
    }
}

class Composite implements Component {
    private List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public void operation() {
        System.out.println("Executando operação em um objeto composto");
        for (Component component : components) {
            component.operation();
        }
    }
}
