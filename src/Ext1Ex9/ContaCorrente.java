package Ext1Ex9;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ContaCorrente{
	private List<Double> saldo = new ArrayList<Double>();
	private List<Integer> id = new ArrayList<Integer>();
	
	public void cadastrar(double valor) {
		this.id.add(this.id.size()-1);
		this.saldo.add(valor);
		JOptionPane.showMessageDialog(null, "Seu id �: "+(id.size()-1));
	}
	
	private void deposita(int id,double valor){
		double conta = this.saldo.get(id);
		double deposito = conta+valor;
		this.saldo.add(id, deposito);
	}
	
	public void depositar(int id,double valor) {
		this.deposita(id, valor);
		JOptionPane.showMessageDialog(null, "Valor depositado!");
	}
	
	private void saca(int id,double valor){
		double conta = this.saldo.get(id);
		double saque = conta-(valor*1.05);
		this.saldo.add(id, saque);
	}
	
	public void sacar(int id,double valor) {
		this.saca(id, valor);
		JOptionPane.showMessageDialog(null, "Valor sacado!");
	}
	
	private double saldo(int id){
		double saldo = this.saldo.get(id);
		return saldo;
	}
	
	public void verSaldo(int id) {
		DecimalFormat df = new DecimalFormat("#.##");
		JOptionPane.showMessageDialog(null, "Seu saldo: "+df.format(this.saldo(id)));
	}
}
