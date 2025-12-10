🚍 Bus Reservation System (Java + MySQL)

A simple console-based Bus Reservation System built using Java, JDBC, and MySQL.
Users can view available buses, check seat availability, and book seats based on journey date.

📌 Features
    > Display all available buses (AC / Non-AC + Capacity)
    > Book a ticket with passenger name, bus number, and date
    > Check seat availability before booking
    > Insert bookings into MySQL database
    > JDBC-based database connectivity
    > Modular code using DAO classes

🛠️ Technologies Used
    # Java (Core Java, OOP, JDBC)
    # MySQL Database
    # JDBC Driver
    # PreparedStatement / Statement
_____________________________________________________________________________________
🗄️ Database Structure
1️⃣ bus table
Column	Type
busno	INT (PK)
ac	BOOLEAN
capacity	INT
Example:
CREATE TABLE bus (
  busno INT PRIMARY KEY,
  ac BOOLEAN,
  capacity INT
);

2️⃣ booking table
Column	Type
passengername	VARCHAR(50)
busno	INT
journey_date	DATE
Example:
CREATE TABLE booking (
  passengername VARCHAR(50),
  busno INT,
  journey_date DATE
);
____________________________________________________________________________________
▶️ How to Run the Project
1. Clone the repository

2. Open the project in any Java IDE

    IntelliJ IDEA

    Eclipse

    VS Code with Java pack

3. Add MySQL JDBC driver (if not already added)

    Ensure mysql-connector-j.jar is added to the classpath.

4. Configure your MySQL connection

    In DBConnection.java, update:

    private static final String url = "jdbc:mysql://localhost:3306/bus_reservation";
    private static final String username = "root";
    private static final String password = "your_password";

5. Run the program

Run:
BusDemo.java

____________________________________________________________________________________
🎮 Sample Workflow

1. System displays all available buses.

2. User enters:
    Passenger Name
    Bus No
    Journey Date (dd-MM-yyyy)

3. System checks availability.

4. If seats are free → Booking confirmed.

5. Otherwise → Informs "Bus is Full".
____________________________________________________________________________________
🙌 Author

Arun Siva
Java Developer | Data Structures | MySQL | JDBC
