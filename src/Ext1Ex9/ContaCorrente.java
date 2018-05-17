package Ext1Ex9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContaCorrente{
	private void deposita(int id,float valor){
	
	}
	
	public void depositar(int id,float valor) {
		try {
			this.deposita(id, valor);
			System.out.println("Valor depositado!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	
}
