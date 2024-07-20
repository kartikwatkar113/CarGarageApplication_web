package cgwapp.repository;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DBConfig {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private static DBConfig db=null;
	
	private DBConfig(String path) {
		try{
			FileInputStream fin=new FileInputStream(path);
			Properties p=new Properties();
			p.load(fin);
			String username=p.getProperty("db.username");
			String pass=p.getProperty("db.password");
			String url=p.getProperty("db.url");
			String driverClassName=p.getProperty("db.driverClassName");
		
			Class.forName(driverClassName);
			conn=DriverManager.getConnection(url,username,pass);
			
			if(conn!=null) {
				System.out.println("Database is Connected");
			}
			else {
				System.out.println("Database not Connected");
			}
		}
		catch(Exception ex) {
			System.out.println("Error is:- "+ex);
		}
	}
	
	//this is factory method
	public static DBConfig getInstance(String path) {
		if(db==null) {
			db=new DBConfig(path);
		}
		return db;
	}
	
	public Connection getConnection() {
		return conn;
	}
	
	public PreparedStatement getPreparedStatement() {
		return pstmt;
	}
	
	public ResultSet getResultSet() {
		return rs;
	}
}
