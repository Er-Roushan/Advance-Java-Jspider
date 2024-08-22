package Assignment;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CRUDWithMethod {
	
	public static void createTable(Statement stmt) throws SQLException {
		
		String query = "CREATE TABLE city (cityname varchar not null, state varchar not null, pin int primary key)";
		stmt.execute(query);
		System.out.println("Table created");
		
	}
	
	public static void insertData(Statement stmt) throws SQLException {
		String query = "INSERT INTO city Values ('Patna', 'Bihar', 800001)";
		stmt.execute(query);
	}
	
	public static void updateRecord(Statement stmt) throws SQLException {
		String query = "UPDATE city SET cityname='Gurugram' WHERE cityname = 'Gurgaon'";
		stmt.execute(query);
		
	}
	
	public static void deleteRecord(Statement stmt) throws SQLException {
		String query = "DELETE FROM city WHERE pin=800001 ";
		stmt.execute(query);
	}

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/firstdatabase";
			String user = "postgres";
			String pwd = "root";
			
			Connection conn = DriverManager.getConnection(url, user, pwd);
			Statement stmt = conn.createStatement();
			
			//method to create table
//			createTable(stmt);
			
			//method for insertion of record
//			insertData(stmt);
			
			//method for updation
//			updateRecord(stmt);
			
			//method for deletion
			deleteRecord(stmt);
			
			
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Successful");
		}

	}

}
