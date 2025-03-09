package encapsulation_polymorphism_interface_and_abstract_class.OnlineFoodDelivery;

public class VegItem extends FoodItem{
    int packingCost;

    public VegItem(String name, int price, int quantity, int packingCost) {
        super(name, price, quantity);
        this.packingCost = packingCost;
    }

    @Override
    public int calculateTotalPrice(){
        return this.price * this.quantity + this.packingCost - this.discount;
    }
}
