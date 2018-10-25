package com.example.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

	public void getUserData() throws SQLException {
		Connection conn=DriverManager.getConnection(
		        "jdbc:ucanaccess://C:/Users/snehashnu.panday/Documents/Database1.accdb");
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("SELECT [last_name] FROM [Employee]");
		while (rs.next()) {
		    System.out.println(rs.getString(1));
		}
	}
}
