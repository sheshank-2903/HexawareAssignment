package dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {  //Factory class
	
	public static Connection getDBConnection() { // Factory method
		
		Connection conn=null;
		
		try {
			FileReader reader = new FileReader("resources/database.properties");
			
			
			Properties properties=new Properties();
			
			
			properties.load(reader);
			
			
			String driverClass=properties.getProperty("driverClass");
			String url=properties.getProperty("url");
			String username=properties.getProperty("username");
			String password=properties.getProperty("password");
			
			
			Class.forName(driverClass);
			

			conn=DriverManager.getConnection(url, username,password);
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 
		
		return conn;
		
		
	}

}
