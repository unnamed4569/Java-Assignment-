abstract class Vehicle {
    public abstract void start();

    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }
}

final class FinalVehicle {
    public void display() {
        System.out.println("This is a final vehicle.");
    }
}

public class Assignment17 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();  
        car.stop();   

        FinalVehicle finalVehicle = new FinalVehicle();
        finalVehicle.display(); 

    }
}
