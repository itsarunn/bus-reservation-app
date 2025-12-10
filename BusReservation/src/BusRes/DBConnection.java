package BusRes;
import java.net.ConnectException;
import java.sql.*;

public class DBConnection {
	
	private static final String url = "jdbc:mysql://localhost:3306/bus_reservation";
	private static final String username = "root";
	private static final String password = "arun";

	public static Connection getconnection() throws SQLException {
		return DriverManager.getConnection(url,username,password);
	}
}
