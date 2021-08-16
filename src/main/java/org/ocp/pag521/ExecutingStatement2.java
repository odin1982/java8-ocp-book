package org.ocp.pag521;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecutingStatement2 {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/celix_prueba?useSSL=false&serverTimezone=America/Mexico_City&allowPublicKeyRetrieval=true";
		try(	Connection conn = DriverManager.getConnection(url,"root","barcelona8");
				Statement stmt = conn.createStatement();
			){
			ResultSet rs2 = stmt.executeQuery("SELECT * FROM almacen");
			boolean isResultSet = stmt.execute("SELECT * FROM almacen");
			if(isResultSet) {
				ResultSet rs = stmt.getResultSet();
				System.out.println("ran a query");
			}else {
				int result = stmt.getUpdateCount();
				System.out.println("ran an update");
			}
		}
	}
}
