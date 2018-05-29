package Ext2Ex1;

public class Imovel {
	protected String endereco;
	protected Double preco;
	
	public Imovel() {
		// TODO Auto-generated constructor stub
	}

	public Imovel(String endereco, Double preco) {
		super();
		this.endereco = endereco;
		this.preco = preco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Imovel [endereco=" + endereco + ", preco=" + preco + "]";
	}
	
	
}
