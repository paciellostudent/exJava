package Ext1Ex9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContaCorrente extends DAO {
	private void deposita(int id,float valor) throws SQLException {
		PreparedStatement stmt = null;
		Connection conn = abrirConexao();
		try {
		stmt = conn.prepareStatement("update conta set saldo = saldo + ? where id = ? ");
		stmt.setDouble(1, valor);
		stmt.setInt(2, id);
		
		int flag = stmt.executeUpdate();
		if(flag==0)
			System.out.println("Deu ruim campeão!");
		}finally {
			stmt.close();
			conn.close();
		}
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
