package encapsulation_polymorphism_interface_and_abstract_class.VehicleRental;


public class Car extends Vehicle {
    public Car(int vehicleNumber, String vehicleType, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.rentalRate = rentalRate;
    }

    @Override
    public void calculateRentalCost(int days) {
        this.rentalCost = rentalRate * days;
    }

    @Override
    public void calculateInsurance(){
        this.insuranceCost = rentalCost * 0.3;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Details");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Insurance Cost: " + insuranceCost);
    }
}

