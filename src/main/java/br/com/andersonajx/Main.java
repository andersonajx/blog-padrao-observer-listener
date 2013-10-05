package br.com.andersonajx;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<Estoque> estoques = new LinkedList<>();

	static {
		estoques.add(new Estoque(new Produto(1L, "Trakinas Morango"), BigDecimal.TEN));
		estoques.add(new Estoque(new Produto(2L, "Trakinas Chocolate"), BigDecimal.TEN));
		estoques.add(new Estoque(new Produto(3L, "Doritos 500g"), BigDecimal.TEN));
	}

	public static void main(String[] args) {
		while (true) {
			Scanner console = new Scanner(System.in);

			listarProdutosEmEstoque();

			System.out.println("\nInforme o codigo do Produto: ");
			long idProduto = console.nextLong();

			System.out.println("\nInforme a quantidade da Venda: ");
			BigDecimal quantidade = console.nextBigDecimal();

			atualizarEstoquePorIDProduto(idProduto, quantidade);
		}
	}

	private static void listarProdutosEmEstoque() {
		System.out.println("\nProdutos em Estoque");
		System.out.println("===================");
		for (Estoque estoque : estoques) {
			System.out.println(estoque);
		}
	}

	private static void atualizarEstoquePorIDProduto(Long id, BigDecimal quantidade) {
		for (Estoque estoque : estoques) {
			if (estoque.getProduto().getId().equals(id)) {
				estoque.setQuantidade(estoque.getQuantidade().subtract(quantidade));
				break;
			}
		}
	}

}
