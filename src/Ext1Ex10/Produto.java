package Ext1Ex10;

public abstract class Produto implements Comparable {
	protected String nome;
	protected Double preco;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String toString() {
		return "Nome=" + nome + ", Preco=" + preco+", ";
	}
	
	public int compareTo(Produto produto2) {
		if (!this.nome.equalsIgnoreCase(produto2.nome)) {
            return this.nome.compareTo(produto2.nome);
		}else {
			return 0;
		}
	}
}
