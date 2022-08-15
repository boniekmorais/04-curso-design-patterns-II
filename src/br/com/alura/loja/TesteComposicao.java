package br.com.alura.loja;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class TesteComposicao {

    public static void main(String[] args) {

        Orcamento orcamentoAntigo = new Orcamento();
        orcamentoAntigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        orcamentoAntigo.reprovar();

        Orcamento orcamentoNovo = new Orcamento();
        orcamentoAntigo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        orcamentoNovo.adicionarItem(orcamentoAntigo);

        OrcamentoProxy orcamentoProxy = new OrcamentoProxy(orcamentoNovo);

        System.out.println(orcamentoProxy.getValor());
        System.out.println(orcamentoProxy.getQuantidadeItens());

        System.out.println(orcamentoProxy.getValor());
        System.out.println(orcamentoProxy.getQuantidadeItens());

    }
}
