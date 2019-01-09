package br.com.prova.util;

import java.sql.*;

public class ConnectionFactory {
	public static Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
        	return DriverManager.getConnection("jdbc:mysql://localhost/prova_davi_pimenta", "root", "senha");
        } catch (SQLException e) {
            throw new RuntimeException("Erro SQLException: "+e);
        } catch (ClassNotFoundException e) {
        	throw new RuntimeException("Erro ClassNotFoundException: "+e);
		}
    }
}
