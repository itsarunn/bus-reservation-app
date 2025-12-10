package BusRes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class BookingDAO {

	public int getFilledSeats(int busno, Date date) throws SQLException {
		String query = "SELECT COUNT(passengername) FROM booking WHERE busno=? AND journey_date=? ";
		Connection con = DBConnection.getconnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setInt(1, busno);
		pst.setDate(2, sqldate);
		ResultSet rs = pst.executeQuery();
		
		rs.next();
		return rs.getInt(1);
	}

	public void addbooking(BusBooking booking) throws SQLException{
		String query = "INSERT INTO booking VALUES(?,?,?)";
		Connection con = DBConnection.getconnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(booking.date.getTime());
		pst.setString(1, booking.passengername);
		pst.setInt(2, booking.busno);
		pst.setDate(3, sqldate);
		pst.executeUpdate();
	}

}
