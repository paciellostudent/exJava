package Ext1Ex10;

public class Livro extends Produto {
	private String autor;
	
	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public Livro(String nome, Double preco,String autor) {
		super(nome,preco);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro: "+super.toString()+"Autor=" + autor;
	}
	
	
}
