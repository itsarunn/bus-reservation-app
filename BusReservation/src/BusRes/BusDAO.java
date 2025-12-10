package BusRes;

import java.sql.*;

public class BusDAO {
	public void displayBusInfo() throws SQLException {
		String query = "SELECT * FROM bus;";
		Connection con = DBConnection.getconnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.print("Bus Number: "+rs.getInt(1));
			if(rs.getInt(2)==0) {
				System.out.print("(Non AC)");
			}else {
				System.out.print("(AC)");
			}
			System.out.println(" and Capacity is "+rs.getInt(3));
		}
		
		System.out.println("------------------------------------------------------------");
	}

	public int getCapacity(int busno) throws SQLException {
		String query = "SELECT capacity FROM bus WHERE busno="+busno;
		Connection con = DBConnection.getconnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
	
		rs.next();
		
		return rs.getInt(1);
	}
}
