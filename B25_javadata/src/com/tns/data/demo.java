package com.tns.data;
import java.sql.*;
import java.sql.DriveManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {
	public static void main(String[] args) throws Exception{
		try {
			Connection con=DriverManager.getConnection("demo:mysql://localhost:3306/b25_nidhi","root","nidhi1234");
					Statement st=con.createStatement();
			String query1="insert into empl value(3,'nidhi')";
			String query="select* from empl";
			ResultSet rs=st.executeQuery("SELECT * from empl");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				
			}
			st.executeUpdate(query1);
			System.out.println("Student table created successfully");
			System.out.println("row inserted");
			st.close();
			rs.close();
			
		}catch(SQLException e) {
			e.printStactTrace();
		}
	
	}
}

