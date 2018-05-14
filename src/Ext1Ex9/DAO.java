package Ext1Ex9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DAO {

	private static final String URL = "jdbc:mysql://localhost/banco";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	public DAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Erro ao selecionar o driver: " + e.getMessage());
		}
	}
	
	protected Connection abrirConexao() throws SQLException {
		Connection conn;
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
		return conn;
	}
}

