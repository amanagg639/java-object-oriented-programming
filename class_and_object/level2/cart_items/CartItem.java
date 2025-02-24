package class_and_object.level2.cart_items;

import java.util.ArrayList;
import java.util.List;

public class CartItem {
    List<Item> items;
    private int TotalPrice;
    CartItem(){
        items = new ArrayList<>();
        System.out.println("This is new Cart");
    }
    public void addItem(String ItemName, int price, int quantity){
        items.add(new Item(ItemName, price, quantity));
        TotalPrice += quantity*price;
    }
    public void removeItem(Item t){
        items.remove(t);
    }
    public void TotalAmount(){
        System.out.println("Your total Amount is: " + TotalPrice);
    }
    public void displayCart(){
        for (Item i : items) {
            System.out.println("Item Name- " + i.ItemName + " | Price- " + i.Price + " | Item Quantity- " + i.quantity);
        }
    }
}
