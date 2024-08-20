package Steps;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.postgresql.Driver;

public class FirstStep {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		try {
			DriverManager.registerDriver(driver);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
