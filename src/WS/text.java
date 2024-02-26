//// Import necessary classes
//import java.util.ArrayList;
//import java.util.List;
//
//// Aircraft entity
//class Aircraft {
//    int id;
//    String model;
//    int capacity;
//    int range;
//
//    // Constructor for Aircraft entity
//    public Aircraft(int id, String model, int capacity, int range) {
//        this.id = id;
//        this.model = model;
//        this.capacity = capacity;
//        this.range = range;
//    }
//}
//
//// Booking entity
//class Booking {
//    int id;
//    String flightNumber;
//    String passengerName;
//    String seatNumber;
//
//    // Constructor for Booking entity
//    public Booking(int id, String flightNumber, String passengerName, String seatNumber) {
//        this.id = id;
//        this.flightNumber = flightNumber;
//        this.passengerName = passengerName;
//        this.seatNumber = seatNumber;
//    }
//}
//
//// Passenger entity
//class Passenger {
//    int id;
//    String name;
//    int age;
//    String nationality;
//
//    // Constructor for Passenger entity
//    public Passenger(int id, String name, int age, String nationality) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.nationality = nationality;
//    }
//}
//
//// Data Access Layer (DAL)
//class AirlineDAL {
//    private List<Aircraft> aircraftList = new ArrayList<>();
//    private List<Booking> bookingList = new ArrayList<>();
//    private List<Passenger> passengerList = new ArrayList<>();
//
//    // Methods for Aircraft
//    public void addAircraft(Aircraft aircraft) {
//        aircraftList.add(aircraft);
//    }
//
//    public List<Aircraft> getAllAircraft() {
//        return aircraftList;
//    }
//
//    // Methods for Booking
//    public void addBooking(Booking booking) {
//        bookingList.add(booking);
//    }
//
//    public List<Booking> getAllBookings() {
//        return bookingList;
//    }
//
//    // Methods for Passenger
//    public void addPassenger(Passenger passenger) {
//        passengerList.add(passenger);
//    }
//
//    public List<Passenger> getAllPassengers() {
//        return passengerList;
//    }
//}
//
//// Main class for AirlineCompany
//public class AirlineCompany {
//    public static void main(String[] args) {
//        // Creating instances of Aircraft, Booking, and Passenger
//        Aircraft aircraft1 = new Aircraft(1, "Boeing 737", 150, 3000);
//        Aircraft aircraft2 = new Aircraft(2, "Airbus A320", 180, 2500);
//        Aircraft aircraft3 = new Aircraft(3, "Boeing 777", 300, 5000);
//
//        Booking booking1 = new Booking(101, "ABC123", "John Doe", "A1");
//        Booking booking2 = new Booking(102, "XYZ789", "Jane Smith", "B2");
//
//        Passenger passenger1 = new Passenger(201, "Alice Johnson", 25, "USA");
//        Passenger passenger2 = new Passenger(202, "Bob Williams", 30, "Canada");
//
//        // Creating an instance of AirlineDAL
//        AirlineDAL airlineDAL = new AirlineDAL();
//
//        // Adding entities to the DAL
//        airlineDAL.addAircraft(aircraft1);
//        airlineDAL.addAircraft(aircraft2);
//        airlineDAL.addAircraft(aircraft3);
//
//        airlineDAL.addBooking(booking1);
//        airlineDAL.addBooking(booking2);
//
//        airlineDAL.addPassenger(passenger1);
//        airlineDAL.addPassenger(passenger2);
//
//        // Retrieving entities from the DAL
//        List<Aircraft> allAircraft = airlineDAL.getAllAircraft();
//        List<Booking> allBookings = airlineDAL.getAllBookings();
//        List<Passenger> allPassengers = airlineDAL.getAllPassengers();
//
//        // Displaying retrieved entities
//        System.out.println("All Aircraft:");
//        for (Aircraft aircraft : allAircraft) {
//            System.out.println(aircraft.id + ": " + aircraft.model);
//        }
//
//        System.out.println("\nAll Bookings:");
//        for (Booking booking : allBookings) {
//            System.out.println(booking.id + ": " + booking.flightNumber);
//        }
//
//        System.out.println("\nAll Passengers:");
//        for (Passenger passenger : allPassengers) {
//            System.out.println(passenger.id + ": " + passenger.name);
//        }
//    }
//}
