package br.com.andersonajx;

import java.math.BigDecimal;

public interface Listener {

	void atualizarEstoque(Produto produto, BigDecimal quantidade);

}
