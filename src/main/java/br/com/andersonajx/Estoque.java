package br.com.andersonajx;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public final class Estoque implements Observer {

	private Map<Produto, BigDecimal> produtos = new HashMap<>();

	public void adicionarProdutoEmEstoque(Produto produto, BigDecimal quantidade) {
		produtos.put(produto, quantidade);
	}

	@Override
	public void atualizarEstoque(Produto produto, BigDecimal quantidade) {
		BigDecimal quantidadeProduto = produtos.get(produto);
		produtos.put(produto, quantidadeProduto.subtract(quantidade));
	}

	public void listarProdutosEmEstoque() {
		System.out.println("\nProdutos em Estoque");
		System.out.println("===================");
		for (Map.Entry<Produto, BigDecimal> entry : produtos.entrySet()) {
			System.out.println(entry.getKey() + " : Quantidade: " + entry.getValue());
		}
	}

	public Produto obterProdutoDoEstoquePorId(Long id) {
		for (Produto produto : produtos.keySet()) {
			if (produto.getId().equals(id)) {
				return produto;
			}
		}
		return null;
	}

	public Map<Produto, BigDecimal> getProdutos() {
		return produtos;
	}

	public void setProdutos(Map<Produto, BigDecimal> produtos) {
		this.produtos = produtos;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Estoque estoque = (Estoque) o;
		if (produtos != null ? !produtos.equals(estoque.produtos) : estoque.produtos != null) return false;
		return true;
	}

	@Override
	public int hashCode() {
		return produtos != null ? produtos.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "Estoque{" +	"produtos=" + produtos + '}';
	}

}
