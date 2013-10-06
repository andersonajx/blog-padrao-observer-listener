package br.com.andersonajx;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public final class Venda implements Event {

	private List<Listener> listeners = new LinkedList<>();

	private Produto produto;
	private BigDecimal quantidade;

	@Override
	public void addListener(Listener listener) {
		listeners.add(listener);
	}

	@Override
	public void removeListener(Listener listener) {
		listeners.remove(listener);
	}

	@Override
	public void fireAtualizarEstoque() {
		for (Listener listener : listeners) {
			listener.atualizarEstoque(produto, quantidade);
		}
	}

	public void vender(Produto produto, BigDecimal quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;

		System.out.println("\nVenda efetuada com sucesso!\n");

		fireAtualizarEstoque();
	}

}
