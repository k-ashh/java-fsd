import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	
	public static final String DRIVER_CLASS="com.mysql.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://localhost:3306/p2";
	public static final String USERNAME="root";
	public static final String PASSWORD="ash1999";
	
	public static Connection getCon() throws ClassNotFoundException, SQLException {
		//register the driver
		Class.forName(DRIVER_CLASS);
		Connection con=DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
		return con;
		}

}
