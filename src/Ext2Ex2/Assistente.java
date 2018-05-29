package Ext2Ex2;

public class Assistente extends Funcionario {
	private int matricula;
	 
	public Assistente() {
		// TODO Auto-generated constructor stub
	}

	public Assistente(int matricula) {
		super();
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String exibeDados() {
		// TODO Auto-generated method stub
		return super.exibeDados()+"Matricula: "+this.matricula;
	}
}
