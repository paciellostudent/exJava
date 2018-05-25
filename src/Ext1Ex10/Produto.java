package Ext1Ex10;

public class Produto implements Comparable<Produto> {
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

	//EXERCÍCIO 11
	//CompareTo por nome
	/*@Override
	public int compareTo(Produto nome) {
		return this.nome.compareTo(nome.getNome());
	}*/
	
	//CompareTo por preço
	@Override
	public int compareTo(Produto preco) {
		return this.preco.compareTo(preco.getPreco());
	}
}

