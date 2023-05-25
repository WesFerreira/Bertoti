package br.com.wesley.loja.singleton;

public class Main {
    public static void main(String[] args) {

        // Obter a instância do HttpClient
        HttpClient client1 = HttpClient.getInstance();
        HttpClient client2 = HttpClient.getInstance();

        // Ambas as instâncias apontam para o mesmo objeto
        System.out.println(client1 == client2);  // Output: true

        // Exemplo de chamadas HTTP
        client1.get("https://localhost:8080/aplicacao");
        client2.post("https://localhost:8080/aplicacao");
    }
}

