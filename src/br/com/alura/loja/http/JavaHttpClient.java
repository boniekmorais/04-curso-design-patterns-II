package br.com.alura.loja.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlApi = new URL(url);
            URLConnection conn = urlApi.openConnection();
            conn.connect();
        } catch(MalformedURLException ex) {
            throw new RuntimeException("Erro ao enviar requisição HTTP.", ex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
