package dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
//	public static void main(String[] args) {
//		getConnection();
//	}

	public static Connection getConnection() {
		
		
		Connection conn=null;
		
		try {
			
			FileReader reader=new FileReader("resources/database.properties");
			
			Properties properties=new Properties();
			properties.load(reader);
			
			String driverClass=properties.getProperty("driverClass");
			String url=properties.getProperty("url");
			String username=properties.getProperty("username");
			String password=properties.getProperty("password");
			
			Class.forName(driverClass);
			
			conn=DriverManager.getConnection(url,username,password);
			
			
		} 
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

		return conn;
		//System.out.println(conn);
		
	}

}
