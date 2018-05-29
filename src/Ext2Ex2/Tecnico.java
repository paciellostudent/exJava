package Ext2Ex2;

public class Tecnico extends Assistente {
	private Double salAd;

	public Tecnico() {
		super();
		this.salAd = salario*1.3;
	}

	public Double getSalAd() {
		return salAd-salario;
	}
	
	@Override
	public String exibeDados() {
		// TODO Auto-generated method stub
		return super.exibeDados()+"Salário adicional: "+salAd;
	}
}	
