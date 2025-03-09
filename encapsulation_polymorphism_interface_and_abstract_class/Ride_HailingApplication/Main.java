package encapsulation_polymorphism_interface_and_abstract_class.Ride_HailingApplication;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>(){{
            add(new Bike("Rishav", 10));
            add(new Car("Netan", 23));
            add(new Auto("Sahil", 16));
        }};

        for (Vehicle vehicle : vehicles) {
            vehicle.calculateFare((int)(Math.random()*100));
            vehicle.updateLocation();
        }
    }
}