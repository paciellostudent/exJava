package Ext2Ex2;

public class Funcionario {
	protected String nome;
	protected Double salario;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String exibeDados() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}
	
	
}
