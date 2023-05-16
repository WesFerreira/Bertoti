package br.com.wesley.loja.imposto;

import br.com.wesley.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}
