package BusRes;

import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BusBooking {
	String passengername;
	int busno;
	Date date;

	BusBooking(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Passenger Name:");
		passengername = sc.next();
		System.out.println("Enter Bus Number:");
		busno = sc.nextInt();
		System.out.println("Enter date in the format of dd-mm-yyyy");
		String dateinput = sc.next();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateformat.parse(dateinput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean isAvailable() throws SQLException{
		
		BusDAO busdao = new BusDAO();
		int capacity = busdao.getCapacity(busno);
		
		BookingDAO bookingdao = new BookingDAO();
		int filledseats = bookingdao.getFilledSeats(busno,date);
		
		
		return filledseats<capacity;
	}
	
	
}
