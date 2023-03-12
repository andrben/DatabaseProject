package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DeleteExample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");

		Statement stmt = con.createStatement();

		stmt.executeUpdate("delete from eproduct where name = 'Television'");

		System.out.println("The row is deleted");
		
		ResultSet result = stmt.executeQuery("select * from eproduct");
		
		while (result.next()) {

			System.out.println("Product Id " + result.getInt("ID"));
			System.out.println("Product name " + result.getString("name"));
			System.out.println("Product name " + result.getDouble("price"));
		}
		
		con.close();

	}

}
