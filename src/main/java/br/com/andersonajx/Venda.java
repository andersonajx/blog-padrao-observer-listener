package br.com.andersonajx;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public final class Venda implements Subject {

	private List<Observer> observers = new LinkedList<>();

	private Produto produto;
	private BigDecimal quantidade;

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.atualizarEstoque(produto, quantidade);
		}
	}

	public void vender(Produto produto, BigDecimal quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;

		System.out.println("\nVenda efetuada com sucesso!\n");

		notifyObservers();
	}

}
