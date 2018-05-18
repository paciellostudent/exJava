package exercicios;

import Ext1Ex9.ContaCorrente;
import Ext1Ex9.ContaPremium;

public class Ext1Ex9 {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		//Para cadastro insira um valor inicial e será informado seu id
		cc.cadastrar(32.5);
		
		//Para deposito insira o id da conta e o valor que será depositado
		cc.depositar(0, 10);
		
		//Para ver o saldo insira o id da conta
		cc.verSaldo(0);
		
		//Para sacar insira o id da conta e o valor a ser sacado
		cc.sacar(0, 50);
		
		//Ao sacar será descontado 0,5% do valor sacado
		cc.verSaldo(0);
		
		cc.cadastrar(44.24);
		
		cc.sacar(1, 30);
		
		cc.verSaldo(1);
		
		ContaPremium cp = new ContaPremium();
		
		cp.cadastrar(33);
		//Para as contas premium o valor descontado no saque é de 0,1%
		cp.sacar(0, 30);
		
		cp.verSaldo(0);
	}
}
