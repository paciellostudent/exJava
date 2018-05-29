package Ext2Ex2;

public class Gerente {
	private String nome;
	private Double preco;
	private String area;
	
	public Gerente() {
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, Double preco, String area) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.area = area;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", preco=" + preco + ", area=" + area + "]";
	}
	
	
}
