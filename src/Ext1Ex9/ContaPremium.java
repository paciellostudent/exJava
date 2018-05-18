package Ext1Ex9;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ContaPremium{
	private List<Double> saldo = new ArrayList<Double>();
	private List<Integer> id = new ArrayList<Integer>();
	
	public void cadastrar(double valor) {
			this.id.add(this.id.size()-1);
			this.saldo.add(valor);
			JOptionPane.showMessageDialog(null, "Seu id é: "+(id.size()-1));
	}
	
	private void deposita(int id,double valor){
		double conta = this.saldo.get(id);
		double deposito = conta+valor;
		this.saldo.add(id, deposito);
	}
	
	public void depositar(int id,double valor) {
		try {
			this.deposita(id, valor);
			JOptionPane.showMessageDialog(null, "Valor depositado!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	private void saca(int id,double valor){
		double conta = this.saldo.get(id);
		double saque = (conta-valor)*0.99;
		this.saldo.add(id, saque);
	}
	
	public void sacar(int id,double valor) {
		try {
			this.saca(id, valor);
			JOptionPane.showMessageDialog(null, "Valor sacado!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
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

