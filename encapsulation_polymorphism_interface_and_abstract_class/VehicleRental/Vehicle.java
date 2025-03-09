package encapsulation_polymorphism_interface_and_abstract_class.VehicleRental;

public abstract class Vehicle implements IInsurable{
    protected int vehicleNumber;
    String vehicleType;
    double rentalRate;
    double insuranceCost;
    double rentalCost;

    public abstract void calculateRentalCost(int days);
}