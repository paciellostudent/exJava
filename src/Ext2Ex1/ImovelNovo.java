package Ext2Ex1;

public class ImovelNovo extends Imovel {
	private Double precoAd;
	
	public ImovelNovo(String endereco,Double p) {
		this.endereco = endereco;
		this.preco = p;
		this.precoAd = preco*1.1;
	}
	
	public Double getPrecoAd() {
		return this.precoAd-this.preco;
	}

	@Override
	public String toString() {
		return super.toString()+" ImovelNovo [precoAd=" + precoAd + "]";
	}

}
