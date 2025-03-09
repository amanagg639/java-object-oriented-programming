package encapsulation_polymorphism_interface_and_abstract_class.E_Commerce;

public class Electronics extends Product {
    public Electronics(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public void calculateDiscount() {
        discount = productPrice * 0.20;
    }

    @Override
    public void calculateTax(){
        tax = productPrice * 0.28;
    }
    @Override
    public double getTaxDetails(){
        return tax;
    }
}