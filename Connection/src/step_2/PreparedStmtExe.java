package step_2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class PreparedStmtExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/firstdatabase";
			String user = "postgres";
			String pwd = "root";
			
			Connection conn = DriverManager.getConnection(url, user, pwd);
			String query = "INSERT INTO car (name, model, colour, doors) VALUES (? , ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, "Mahindra");
			pstmt.setString(2, "Thar Roxx");
			pstmt.setString(3, "Black");
			pstmt.setInt(4, 5);
			
			pstmt.executeUpdate();
			
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Job Done");
		}

	}

}
