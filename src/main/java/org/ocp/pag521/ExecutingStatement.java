package org.ocp.pag521;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecutingStatement {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/celix_prueba?useSSL=false&serverTimezone=America/Mexico_City&allowPublicKeyRetrieval=true";
		try(	Connection conn = DriverManager.getConnection(url,"root","barcelona8");
				Statement stmt = conn.createStatement();
			){
			int result = stmt.executeUpdate("insert into almacen values('TIENDA')");
			System.out.println(result);
			result = stmt.executeUpdate("update species set name = '' where name = 'None'");
			System.out.println(result);
			result = stmt.executeUpdate("delete from species where id = 10");
			System.out.println(result);
		}
	}
}
