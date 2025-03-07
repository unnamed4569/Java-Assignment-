class Vehicle {
    String vNo;  
    int no_of_wheel; 
    int max_speed; 

    public Vehicle(String vNo, int no_of_wheel, int max_speed) {
        this.vNo = vNo;
        this.no_of_wheel = no_of_wheel;
        this.max_speed = max_speed;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vNo);
        System.out.println("Number of Wheels: " + no_of_wheel);
        System.out.println("Maximum Speed: " + max_speed + " km/h");
    }
}

class Passenger extends Vehicle {
    int no_of_passengers;

    public Passenger(String vNo, int no_of_wheel, int max_speed, int no_of_passengers) {
        super(vNo, no_of_wheel, max_speed);  
        this.no_of_passengers = no_of_passengers;
    }

    public void displayPassengerDetails() {
        displayVehicleDetails();  
        System.out.println("Number of Passengers: " + no_of_passengers);
    }
}

class Bus extends Passenger {
    String route;
    double fare_per_person;
    String helper_name;

    public Bus(String vNo, int no_of_wheel, int max_speed, int no_of_passengers,
               String route, double fare_per_person, String helper_name) {
        super(vNo, no_of_wheel, max_speed, no_of_passengers);  
        this.route = route;
        this.fare_per_person = fare_per_person;
        this.helper_name = helper_name;
    }

    public void displayBusDetails() {
        displayPassengerDetails();  
        System.out.println("Route: " + route);
        System.out.println("Fare per Person: " + fare_per_person);
        System.out.println("Helper Name: " + helper_name);
    }
}

class Taxi extends Passenger {
    double fare_per_km;

    public Taxi(String vNo, int no_of_wheel, int max_speed, int no_of_passengers, double fare_per_km) {
        super(vNo, no_of_wheel, max_speed, no_of_passengers);  
        this.fare_per_km = fare_per_km;
    }

    public void displayTaxiDetails() {
        displayPassengerDetails();  
        System.out.println("Fare per Kilometer: " + fare_per_km);
    }
}

public class Assignment13 {
    public static void main(String[] args) {
        Bus bus = new Bus("BUS123", 6, 80, 40, "Dang To Ktm", 15.0, "Sameer Pandey");
        bus.displayBusDetails();  

        System.out.println("\nSAMEER KAALE\n");

        Taxi taxi = new Taxi("TAXI456", 4, 100, 4, 10.0);
        taxi.displayTaxiDetails(); 
    }
}
