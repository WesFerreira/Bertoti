package br.com.wesley.loja.singleton;

public class HttpClient {
    private static HttpClient instance;
    private HttpClient() {
    }

    //Só tem essa instância e apenas UM acesso "global" para ela
    public static HttpClient getInstance() {
        if (instance == null) {
            instance = new HttpClient();
        }
        return instance;
    }

    public void get(String url) {
        //lógica GET
        System.out.println("GET request to: " + url);
    }

    public void post(String url) {
        //lógica POST
        System.out.println("POST request to: " + url);
    }
}
