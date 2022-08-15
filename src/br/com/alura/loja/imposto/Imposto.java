package br.com.alura.loja.imposto;

import java.math.BigDecimal;
import java.util.Objects;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Imposto {

	private Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

	public BigDecimal calcular(Orcamento orcamento) {

		BigDecimal valorImposto = realizarCalculo(orcamento);
		BigDecimal valorOutroImposto = BigDecimal.ZERO;

		if (Objects.nonNull(outroImposto)) {
			valorOutroImposto = outroImposto.realizarCalculo(orcamento);
		}

		return valorImposto.add(valorOutroImposto);
	}

}
