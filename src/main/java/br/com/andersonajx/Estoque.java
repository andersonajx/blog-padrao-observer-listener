package br.com.andersonajx;

import java.math.BigDecimal;

public class Estoque {

	private Produto produto;
	private BigDecimal quantidade = BigDecimal.ZERO;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

}
