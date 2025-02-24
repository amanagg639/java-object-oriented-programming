package class_and_object.level2.cart_items;

public class Main {
    public static void main(String[] args) {
        CartItem c1 = new CartItem();
        c1.addItem("Quaker Oats", 50, 2);
        c1.addItem("Pintola Peanut-Butter", 550, 1);
        c1.addItem("H&M Hoodie", 2200, 1);
        c1.TotalAmount();
        c1.displayCart();
    }
}
