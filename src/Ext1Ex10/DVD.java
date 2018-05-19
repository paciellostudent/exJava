package Ext1Ex10;

public class DVD extends Produto{
	private Double duracao;
	
	public DVD() {
		// TODO Auto-generated constructor stub
	}

	public DVD(String nome, Double preco,Double duracao) {
		super(nome,preco);
		this.duracao = duracao;
	}

	public Double getDuracao() {
		return duracao;
	}

	public void setDuracao(Double duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "DVD: "+super.toString()+"Duracao=" + duracao;
	}
	
	
}
