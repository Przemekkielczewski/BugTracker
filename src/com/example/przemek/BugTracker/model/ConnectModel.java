package com.example.przemek.BugTracker.model;

import java.sql.*;

public class ConnectModel {

	public String [] Connect ( String userName, String password) {
		
		String[] names = new String [107];
		int index = 0;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@city.wsisiz.edu.pl:1521:orcl",
					userName, password);
			Statement statement= conn.createStatement();
			String sql = "select * from employees";
			ResultSet rs = statement.executeQuery(sql); 
			while (rs.next())
			{
				 names [index] = rs.getString(2) + " " + rs.getString(3);
				 index = index+1;
			}
			conn.close();

		} catch (SQLException ex) {

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return names;
	}
}
