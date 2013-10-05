package br.com.andersonajx;

import java.math.BigDecimal;

public interface Observer {

	void atualizarEstoque(Produto produto, BigDecimal quantidade);

}
