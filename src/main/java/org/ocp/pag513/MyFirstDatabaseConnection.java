package org.ocp.pag513;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstDatabaseConnection {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/celix_prueba?useSSL=false&serverTimezone=America/Mexico_City&allowPublicKeyRetrieval=true";
		try(Connection conn = DriverManager.getConnection(url,"root","barcelona8");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM almacen")){	
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2));
			}
		}
	}
}
