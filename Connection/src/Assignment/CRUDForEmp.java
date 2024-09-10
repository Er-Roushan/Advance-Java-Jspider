package Assignment;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class CRUDForEmp {
	
	//method for creation of Employees Table
	public static void CreateTable(Statement stmt) throws SQLException {
		
		String query = "CREATE TABLE Employees (EID int primary key, ENAME varchar NOT NULL, MGR int, DEPT int, CONTACT bigint NOT NULL)";
		stmt.execute(query);
		System.out.println("Table Created");
	}
	
	//method for insertion in Employees Table
	public static void insertion(Connection conn) throws SQLException {
		Scanner obj = new Scanner(System.in);
		String query = "INSERT INTO Employees (EID, ENAME, MGR, DEPT, CONTACT) VALUES (? , ?, ?, ?,?)";
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		System.out.print("How Many Enteries You want to fill: ");
		int enteries = obj.nextInt();	
		
		for(int i=0; i<enteries; i++) {
			System.out.println("\n======"+ (i+1) + "=======\n");
			System.out.print("Enter EID: ");
			int eid = obj.nextInt();
			
			obj.nextLine();
			System.out.print("Enter ENAME: ");
			String ename = obj.nextLine();
			
			System.out.print("Enter MGR: ");
			int mgr = obj.nextInt();
			
			System.out.print("Enter DEPT: ");
			int dept = obj.nextInt();
			
			System.out.print("Enter CONTACT: ");
			long contact = obj.nextLong();
			
			pstmt.setInt(1, eid);
			pstmt.setString(2, ename);
			pstmt.setInt(3, mgr);
			pstmt.setInt(4, dept);
			pstmt.setLong(5, contact);
			
			pstmt.executeUpdate();
			
		}
		obj.close();
	}
	
	//method for updation in Employees Table 
	public static void updateRecord(Statement stmt) throws SQLException {
		String query = "UPDATE Employees SET CONTACT=1234567890 WHERE EID = 5";
		stmt.executeUpdate(query);
		
	}
	
	//method for deletion in Employees Table
	public static void deleteRecord(Statement stmt) throws SQLException {
		String query = "DELETE FROM Employees WHERE EID=4";
		stmt.executeUpdate(query);
	}
	
	//method to fetch all the records and display
    public static void displayData(Statement stmt) throws SQLException {
		
		String query = "SELECT * FROM Employees";
		ResultSet result = stmt.executeQuery(query);
		int i=1;
		while(result.next()){
            
            int eid = result.getInt("EID");
            String ename = result.getString("ENAME");
            int mgr = result.getInt("MGR");
            int dept = result.getInt("DEPT");
            long contact = result.getLong("CONTACT");
           
            System.out.println("Record "+ i + ": ");
            System.out.print("ID: ");
            System.out.print(eid + "\t");
            
            System.out.print("NAME: ");
            System.out.print(ename + "\t");
            
            System.out.print("MGR: ");
            System.out.println(mgr + "\t");
            
            System.out.print("DEPT: ");
            System.out.println(dept + "\t");
            
            System.out.print("CONTACT: ");
            System.out.println(contact + "\t");
            
            i++;
        }
	}
	
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/firstdatabase";
			String user = "postgres";
			String pwd = "root";
			
			Connection conn = DriverManager.getConnection(url, user, pwd);
			Statement stmt = conn.createStatement();
			//for Table Creation
			//CreateTable(stmt);
			
			//insertion
			//insertion(conn);
			
			//updation
			//updateRecord(stmt);
			
			//deletion
			//deleteRecord(stmt);
			
			//display Records
			displayData(stmt);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Code Successfully Executed");
		}
	}

}
