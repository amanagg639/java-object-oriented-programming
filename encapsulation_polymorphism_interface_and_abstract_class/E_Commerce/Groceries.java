package encapsulation_polymorphism_interface_and_abstract_class.E_Commerce;

public class Groceries extends Product{
    public Groceries(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public void calculateDiscount() {
        discount = productPrice * 0.05;
    }

    @Override
    public void calculateTax(){
        tax = productPrice * 0.12;
    }
    @Override
    public double getTaxDetails(){
        return tax;
    }
}
