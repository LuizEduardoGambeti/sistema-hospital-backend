package br.com.fiap.satih.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConexao() {
		String jdbc = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
		try {
			return DriverManager.getConnection(jdbc, "pf0313", "eduFiap2022");			
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
