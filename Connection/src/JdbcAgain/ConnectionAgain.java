package JdbcAgain;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ConnectionAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/firstdatabase";
			String user = "postgres";
			String pwd = "root";
			
			Connection conn = DriverManager.getConnection(url, user, pwd);
			Statement stmt = conn.createStatement();
			//System.out.println(stmt);
			
			String query = "Select * from city";
			ResultSet rs = stmt.executeQuery(query);
			
			int i=1;
			while(rs.next()) {
				
	            String cityname = rs.getString("cityname");
	            String state = rs.getString("state");
	            int pin = rs.getInt("pin");
	            
	            System.out.println("Record "+ i + ": ");
	            System.out.print("City: ");
	            System.out.print(cityname + "\t");
	            
	            System.out.print("State: ");
	            System.out.print(state + "\t");
	            
	            System.out.print("Pin: ");
	            System.out.println(pin + "\t");
	            
	            i++;
			}
			
			
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("\nCode Successfully Executed.");
		}
	}
	
}

