package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {

		ItemOrcamento itemOrcamento1 = new ItemOrcamento(new BigDecimal("200"));
		ItemOrcamento itemOrcamento2 = new ItemOrcamento(new BigDecimal("1000"));
		ItemOrcamento itemOrcamento3 = new ItemOrcamento(new BigDecimal("500"));

		Orcamento primeiro = new Orcamento();
		primeiro.adicionarItem(itemOrcamento1);

		Orcamento segundo = new Orcamento();
		segundo.adicionarItem(itemOrcamento2);

		Orcamento terceiro = new Orcamento();
		terceiro.adicionarItem(itemOrcamento3);

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));
		System.out.println(calculadora.calcular(terceiro));
	}

}
