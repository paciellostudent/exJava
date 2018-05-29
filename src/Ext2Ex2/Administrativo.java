package Ext2Ex2;

public class Administrativo extends Assistente {
	private String turno;
	private Double adNoturno;
	
	public Administrativo() {
		// TODO Auto-generated constructor stub
	}

	public Administrativo(String turno, Double adNoturno) {
		super();
		this.turno = turno;
		this.adNoturno = adNoturno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Double getAdNoturno() {
		return adNoturno;
	}

	public void setAdNoturno(Double adNoturno) {
		this.adNoturno = adNoturno;
	}
	
	@Override
	public String exibeDados() {
		// TODO Auto-generated method stub
		return super.exibeDados()+"Turno: "+turno+", Adicional noturno: "+adNoturno;
	}
}
