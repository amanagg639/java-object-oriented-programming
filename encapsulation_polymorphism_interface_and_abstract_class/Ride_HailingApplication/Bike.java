package encapsulation_polymorphism_interface_and_abstract_class.Ride_HailingApplication;

public class Bike extends Vehicle {
    public Bike(String driverName, int ratePerKm) {
        super(driverName, ratePerKm);
    }

    @Override
    public void calculateFare(double distance) {
        System.out.println("Total Fare: " + (getRatePerKm() * distance + 20));
    }
}
