package br.com.andersonajx;

import java.math.BigDecimal;

public final class Estoque {

	private Produto produto;
	private BigDecimal quantidade = BigDecimal.ZERO;

	public Estoque(Produto produto, BigDecimal quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Estoque estoque = (Estoque) o;
		if (produto != null ? !produto.equals(estoque.produto) : estoque.produto != null) return false;
		if (quantidade != null ? !quantidade.equals(estoque.quantidade) : estoque.quantidade != null) return false;
		return true;
	}

	@Override
	public int hashCode() {
		int result = produto != null ? produto.hashCode() : 0;
		result = 31 * result + (quantidade != null ? quantidade.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Estoque{" +	"produto=" + produto +	", quantidade=" + quantidade +	'}';
	}

}
