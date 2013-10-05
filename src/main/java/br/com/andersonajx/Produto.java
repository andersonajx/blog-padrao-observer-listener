package br.com.andersonajx;

public final class Produto {

	private Long id;
	private String descricao;

	public Produto(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Produto produto = (Produto) o;
		if (descricao != null ? !descricao.equals(produto.descricao) : produto.descricao != null) return false;
		if (id != null ? !id.equals(produto.id) : produto.id != null) return false;
		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Produto{" +	"id=" + id + ", descricao='" + descricao + '\'' + '}';
	}

}
