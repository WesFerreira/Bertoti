| Padrão | Anti-Padrão | Descrição | Problema que resolve |
| -------- | -------- | -------- |------------ |
| Strategy | Herança | Encapsula uma familia de algoritmos e os torna intercambiaveis usando polimorfismo | Duplicação de código |
| Observer | Acoplamento | é usado para estabelecer uma relação de dependência entre objetos, onde um objeto notifica automaticamente outros objetos sobre mudanças em seu estado interno | Desacoplamento de objetos que recebem notificações |
| Composite | Tratamento diversificado de classes | permite tratar objetos individuais e grupos de objetos de maneira uniforme, ou seja, como se fossem um único objeto | de não ter uma uniformização no tratamento dos objetos sendo eles individuais ou em grupos |
| Singleton | Muitas instancias de uma unica classe | Garante apenas uma instância da classe e um ponto global de acesso | Restringe a criação de instâncias de uma classe |
| Facade | Sobrecarga de responsabilidades na classe fachada | Ele encapsula a complexidade do subsistema em uma única classe, e oferece métodos simples e intuitivos para os clientes utilizarem | simplificação de sistemas complexos
