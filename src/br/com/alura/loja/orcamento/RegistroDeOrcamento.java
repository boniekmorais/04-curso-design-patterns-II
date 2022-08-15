package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;

import java.util.Map;

// Design Pattern: Adapter

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        // Chamada HTTP para API externa.
        // URL Connection
        // HTTP Client

        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orçamento não finalizado!");
        }

        String url = "http://api.alura.com";

        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens());

        http.post(url, dados);
    }
}
