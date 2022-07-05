package classes;

import java.sql.*;

public class ConnectionClass {

	Connection con;
	Statement stm;
	ConnectionClass(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_management","root", "9035");
			stm=con.createStatement();
			if(con.isClosed())
				System.out.println("Connection lost!");
			else
				System.out.println("Connection Exixts!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ConnectionClass();
	}

}
