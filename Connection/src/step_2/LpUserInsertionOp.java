package step_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class LpUserInsertionOp {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        try {
            // Load PostgreSQL driver
            Class.forName("org.postgresql.Driver");

            // Database connection details
            String url = "jdbc:postgresql://localhost:5432/firstdatabase";
            String user = "postgres";
            String pwd = "root";
            
            // Establish connection to the database
            Connection conn = DriverManager.getConnection(url, user, pwd);

            // SQL query for inserting data
            String query = "INSERT INTO laptop (brand, model, colour, weight, launchyear) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            // Get the number of entries to insert
            System.out.print("Please enter how many entries you want to add: ");
            int enteries = input.nextInt();

            for (int i = 0; i < enteries; i++) {
                System.out.println("Please enter details about " + (i + 1) + " record.");
                input.nextLine(); // Consume the newline left by nextInt()

                // Get user input for each field
                System.out.print("Enter the Brand name: ");
                String brand = input.nextLine();
                System.out.print("Enter the Model: ");
                String model = input.nextLine();
                System.out.print("Enter the Colour: ");
                String colour = input.nextLine();
                System.out.print("Enter the Weight in kgm: ");
                double weight = input.nextDouble();
                System.out.print("Enter the Launch Year: ");
                int launchyear = input.nextInt();
                
                // Set the values for the prepared statement
                pstmt.setString(1, brand);
                pstmt.setString(2, model);
                pstmt.setString(3, colour);
                pstmt.setDouble(4, weight);
                pstmt.setInt(5, launchyear);
                
                // Execute the insert operation
                pstmt.executeUpdate();
            }

            // Close the connection
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	System.out.print("Successful...Have a Nice day!!!");
            input.close(); // Ensure the scanner is closed
        }
    }
}
