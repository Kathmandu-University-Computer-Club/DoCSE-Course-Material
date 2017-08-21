package edutainment;

import java.awt.Font;
import java.sql.*;

import javax.swing.JLabel;


public class Database {
	private Connection con;//connect database
	public Statement st;//execute queries under the table
	public ResultSet rs;//hold all the result achived or returned by queries

	public Database(){
		connect();
	}
	
	public void connect(){
		
		try{
			String driver="sun.jdbc.odbc.JdbcOdbcDriver";
			Class.forName(driver);
		//	String filename = "Database1.mdb";
			String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=Database1.mdb;";
		//	database+= filename.trim() + ";DriverID=22;READONLY=true}"; // add on to the end 
			// now we can get the connection from the DriverManager
			Connection con = DriverManager.getConnection( database ,"",""); 
			//String db = "jdbc:odbc:olderversion.mdb";
			//con = DriverManager.getConnection(db);
			st = con.createStatement();
			//String sql = "select * from math";
			//rs= st.executeQuery(sql);
			
		}catch(Exception ex){
			
		}
		
	}

}
