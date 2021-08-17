package org.ocp.pag524;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class ReadingResulSet {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/celix_prueba?useSSL=false&serverTimezone=America/Mexico_City&allowPublicKeyRetrieval=true";
		try(	Connection conn = DriverManager.getConnection(url,"root","barcelona8");
				Statement stmt = conn.createStatement();){
			Map<Long,String> idToDescripcionMap = new HashMap<>();
			ResultSet rs = stmt.executeQuery("SELECT id_almacen,descripcion FROM almacen");
			while(rs.next()) {
				long id = rs.getLong("id_almacen");
				String descripcion = rs.getString("descripcion");
				idToDescripcionMap.put(id, descripcion);
			}
			System.out.println(idToDescripcionMap);
		}
	}
}
