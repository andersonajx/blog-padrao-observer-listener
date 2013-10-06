package br.com.andersonajx;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	private static Estoque estoque = new Estoque();
	private static Venda venda = new Venda();

	static {
		estoque.adicionarProdutoEmEstoque(new Produto(1L, "Trakinas Morango"), BigDecimal.TEN);
		estoque.adicionarProdutoEmEstoque(new Produto(2L, "Trakinas Chocolate"), BigDecimal.TEN);
		estoque.adicionarProdutoEmEstoque(new Produto(3L, "Doritos 500g"), BigDecimal.TEN);

		venda.addListener(estoque);
	}

	public static void main(String[] args) {
		while (true) {
			Scanner console = new Scanner(System.in);

			estoque.listarProdutosEmEstoque();

			System.out.println("\nInforme o codigo do Produto: ");
			long idProduto = console.nextLong();

			System.out.println("\nInforme a quantidade da Venda: ");
			BigDecimal quantidade = console.nextBigDecimal();

			venda.vender(estoque.obterProdutoDoEstoquePorId(idProduto), quantidade);
		}
	}


}
