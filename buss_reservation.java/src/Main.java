import java.util.*;

class Passenger {
    private String name;
    private String phoneNumber;
    private int seatNumber;

    public Passenger(String name, String phoneNumber, int seatNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return "Seat " + seatNumber + " - Name: " + name + ", Phone: " + phoneNumber;
    }
}

class Bus {
    private String busId;
    private int capacity;
    private Map<Integer, Passenger> seatMap;

    public Bus(String busId, int capacity) {
        this.busId = busId;
        this.capacity = capacity;
        this.seatMap = new HashMap<>();
    }

    public String getBusId() {
        return busId;
    }

    public int getCapacity() {
        return capacity;
    }

    public Map<Integer, Passenger> getSeatMap() {
        return seatMap;
    }

    public boolean isSeatAvailable(int seatNumber) {
        return !seatMap.containsKey(seatNumber);
    }

    public boolean bookSeat(Passenger passenger) {
        int seatNumber = passenger.getSeatNumber();
        if (seatNumber < 1 || seatNumber > capacity || seatMap.containsKey(seatNumber)) {
            return false; // Seat is already booked or invalid
        }
        seatMap.put(seatNumber, passenger);
        return true;
    }

    public boolean cancelSeat(int seatNumber) {
        if (!seatMap.containsKey(seatNumber)) {
            return false; // Seat is not booked
        }
        seatMap.remove(seatNumber);
        return true;
    }

    public void displayAvailableSeats() {
        System.out.println("Available seats in Bus " + busId + ":");
        for (int i = 1; i <= capacity; i++) {
            if (!seatMap.containsKey(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void displayAllBookings() {
        System.out.println("Bookings for Bus " + busId + ":");
        if (seatMap.isEmpty()) {
            System.out.println("No bookings yet.");
        } else {
            for (Passenger passenger : seatMap.values()) {
                System.out.println(passenger);
            }
        }
    }
}

public class Main {
    private static List<Bus> buses = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize some buses
        buses.add(new Bus("Bus101", 10));
        buses.add(new Bus("Bus102", 15));

        while (true) {
            System.out.println("\n==== Bus Reservation System ====");
            System.out.println("1. View All Buses");
            System.out.println("2. View Available Seats");
            System.out.println("3. Book a Seat");
            System.out.println("4. Cancel a Seat");
            System.out.println("5. Display All Bookings");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewAllBuses();
                    break;
                case 2:
                    viewAvailableSeats(scanner);
                    break;
                case 3:
                    bookASeat(scanner);
                    break;
                case 4:
                    cancelASeat(scanner);
                    break;
                case 5:
                    displayAllBookings(scanner);
                    break;
                case 6:
                    System.out.println("Exiting... Thank you for using the system!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void viewAllBuses() {
        System.out.println("\nList of Buses:");
        for (Bus bus : buses) {
            System.out.println("Bus ID: " + bus.getBusId() + ", Capacity: " + bus.getCapacity());
        }
    }

    private static void viewAvailableSeats(Scanner scanner) {
        System.out.print("Enter Bus ID: ");
        String busId = scanner.next();
        Bus bus = findBusById(busId);
        if (bus != null) {
            bus.displayAvailableSeats();
        } else {
            System.out.println("Bus not found!");
        }
    }

    private static void bookASeat(Scanner scanner) {
        System.out.print("Enter Bus ID: ");
        String busId = scanner.next();
        Bus bus = findBusById(busId);
        if (bus != null) {
            System.out.print("Enter Seat Number to Book: ");
            int seatNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Passenger Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Phone Number: ");
            String phone = scanner.nextLine();

            Passenger passenger = new Passenger(name, phone, seatNumber);
            if (bus.bookSeat(passenger)) {
                System.out.println("Seat " + seatNumber + " successfully booked for " + name + ".");
            } else {
                System.out.println("Failed to book seat. Seat might be unavailable or invalid.");
            }
        } else {
            System.out.println("Bus not found!");
        }
    }

    private static void cancelASeat(Scanner scanner) {
        System.out.print("Enter Bus ID: ");
        String busId = scanner.next();
        Bus bus = findBusById(busId);
        if (bus != null) {
            System.out.print("Enter Seat Number to Cancel: ");
            int seatNumber = scanner.nextInt();
            if (bus.cancelSeat(seatNumber)) {
                System.out.println("Seat " + seatNumber + " successfully canceled.");
            } else {
                System.out.println("Failed to cancel seat. Seat might not be booked.");
            }
        } else {
            System.out.println("Bus not found!");
        }
    }

    private static void displayAllBookings(Scanner scanner) {
        System.out.print("Enter Bus ID: ");
        String busId = scanner.next();
        Bus bus = findBusById(busId);
        if (bus != null) {
            bus.displayAllBookings();
        } else {
            System.out.println("Bus not found!");
        }
    }

    private static Bus findBusById(String busId) {
        for (Bus bus : buses) {
            if (bus.getBusId().equalsIgnoreCase(busId)) {
                return bus;
            }
        }
        return null;
    }
}
