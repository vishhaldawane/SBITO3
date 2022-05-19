package com.sbi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class Department {

	DataSource dataSource;
	
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
	}
	public void showAllDepartments() {
		try {
			Connection conn = dataSource.getConnection();
			Statement st= conn.createStatement();
			ResultSet rs = st.executeQuery("select * from dept");
			while(rs.next()) {
				System.out.println("DEPTNO : "+rs.getInt(1));
				System.out.println("DNAME  : "+rs.getString(2));
				System.out.println("LOC    : "+rs.getString(3));
				System.out.println("------------------");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
