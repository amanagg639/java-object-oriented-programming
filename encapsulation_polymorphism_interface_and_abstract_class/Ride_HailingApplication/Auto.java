package encapsulation_polymorphism_interface_and_abstract_class.Ride_HailingApplication;
public class Auto extends Vehicle {
    public Auto(String driverName, int ratePerKm) {
        super(driverName, ratePerKm);
    }

    @Override
    public void calculateFare(double distance) {
        System.out.println("Total Fare: " + (getRatePerKm() * distance + 25));
    }
}