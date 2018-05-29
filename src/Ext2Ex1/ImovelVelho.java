package Ext2Ex1;

public class ImovelVelho extends Imovel {
	private Double precoDesc;

	public ImovelVelho(String endereco, Double p) {
		this.endereco = endereco;
		this.preco = p;
		this.precoDesc = preco*0.9;
	}

	public Double getPrecoDesc() {
		return this.preco-this.precoDesc;
	}

	@Override
	public String toString() {
		return super.toString()+" ImovelVelho [precoDesc=" + precoDesc + "]";
	}

	
	
}
