package Ext1Ex10;

public class CD extends Produto {
	private Integer faixas;
	
	public CD() {
		// TODO Auto-generated constructor stub
	}

	public CD(String nome, Double preco,Integer faixas) {
		super(nome,preco);
		this.faixas = faixas;
	}

	public Integer getFaixas() {
		return faixas;
	}

	public void setFaixas(Integer faixas) {
		this.faixas = faixas;
	}

	@Override
	public String toString() {
		return "CD: "+super.toString()+"Faixas=" + faixas;
	}
	
	
}
