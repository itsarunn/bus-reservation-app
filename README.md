# Bus Reservation System

A simple **Java-based Bus Reservation System** that allows users to book, cancel, and view seat reservations for buses. This project is designed to help beginners understand core Java concepts like Object-Oriented Programming (OOP), Collections, and Exception Handling.

## Features

1. **View All Buses**: Display the list of available buses with their IDs and capacities.
2. **View Available Seats**: Check the available seats for a specific bus.
3. **Book a Seat**: Reserve a seat by entering passenger details (name, phone number).
4. **Cancel a Seat**: Cancel a seat reservation by providing the seat number.
5. **View All Bookings**: Display all bookings for a specific bus.

---

## Technologies Used

- **Language**: Java
- **Core Concepts**: Object-Oriented Programming (OOP), Collections (`HashMap`, `ArrayList`), Exception Handling.
- **Tools**: Any Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor with `javac` and `java` commands.

---

## Project Structure

The project is divided into the following classes:

1. **Passenger**:
   - Stores details about passengers (name, phone number, seat number).
   - Overrides `toString()` to display passenger details.

2. **Bus**:
   - Represents a bus with an ID, capacity, and seat reservations.
   - Contains methods for booking, canceling, and displaying seats.

3. **BusReservationSystem**:
   - The main class that interacts with users via a menu-driven interface.
   - Manages multiple buses and provides options to book, cancel, and view reservations.

---

## How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/your-username/bus-reservation-system.git
   cd bus-reservation-system
   ```

2. Compile the code:

   ```bash
   javac BusReservationSystem.java
   ```

3. Run the program:

   ```bash
   java BusReservationSystem
   ```

---

## Sample Interaction

1. View all buses:
   ```
   ==== Bus Reservation System ====
   1. View All Buses
   Bus ID: Bus101, Capacity: 10
   Bus ID: Bus102, Capacity: 15
   ```

2. Book a seat:
   ```
   Enter Bus ID: Bus101
   Enter Seat Number to Book: 3
   Enter Passenger Name: John Doe
   Enter Phone Number: 1234567890
   Seat 3 successfully booked for John Doe.
   ```

3. View available seats:
   ```
   Enter Bus ID: Bus101
   Available seats: 1, 2, 4, 5...
   ```

4. Cancel a seat:
   ```
   Enter Bus ID: Bus101
   Enter Seat Number to Cancel: 3
   Seat 3 successfully canceled.
   ```

---

## Future Enhancements

1. **Persistent Storage**: Add File I/O to save reservations and retrieve them after restarting the program.
2. **Graphical Interface**: Implement a GUI using JavaFX or Swing.
3. **Database Integration**: Use JDBC to connect to a database for managing buses and reservations.
4. **Web Application**: Develop a web-based system using Java Spring Boot.

---

## License

This project is licensed under the MIT License. Feel free to use, modify, and distribute it.

---

## Contributing

Contributions are welcome! Please open an issue or submit a pull request with your improvements or suggestions.

---

## Contact

For any questions or feedback, please reach out to [your-email@example.com](mailto:your-email@example.com).

Happy Coding!


