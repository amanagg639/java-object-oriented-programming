package encapsulation_polymorphism_interface_and_abstract_class.E_Commerce;

public class Clothing extends Product{
    public Clothing(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public void calculateDiscount() {
        discount = productPrice * 0.10;
    }

    @Override
    public void calculateTax(){
        tax = productPrice * 0.18;
    }
    @Override
    public double getTaxDetails(){
        return tax;
    }
}
