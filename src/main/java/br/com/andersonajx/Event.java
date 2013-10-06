package br.com.andersonajx;

public interface Event {

	void addListener(Listener listener);

	void removeListener(Listener listener);

	void fireAtualizarEstoque();

}
