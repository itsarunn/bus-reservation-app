package BusRes;
import java.sql.*;
import java.util.*;

public class BusDemo {

	public static void main(String[] args) throws SQLException {
		
		BusDAO busdao = new BusDAO();
		busdao.displayBusInfo();
		
		int choice=1;
		Scanner sc = new Scanner(System.in);
		while(choice==1) {
			System.out.println("Enter your choice 1 or 2");
			choice = sc.nextInt();
			if(choice==1) {
				BusBooking booking = new BusBooking();
				if(booking.isAvailable()) {
					BookingDAO bookingdao = new BookingDAO();
					bookingdao.addbooking(booking);
					System.out.println("Booked Successfully");
				}else {
					System.out.println("Bus is Full, Try another Date or Bus");
				}
			}else if(choice!=1 && choice!=2) {
				System.out.println("Enter valid choice");
				choice=1;
			}
		}
		sc.close();

	}

}
