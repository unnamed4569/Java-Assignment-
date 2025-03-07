class Vehicle {
    public void sound() {
        System.out.println("Vehicle makes a sound");
    }
}

class Car extends Vehicle {
    @Override
    public void sound() {
        System.out.println("Car sounds hutuuuuututututututu");
    }
}

public class Assignment14 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(); 
        Car car = new Car();  

        vehicle.sound(); 

        car.sound(); 

        Vehicle vehicleCar = new Car();  
        vehicleCar.sound();  
    }
}
