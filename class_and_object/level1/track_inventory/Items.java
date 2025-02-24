package class_and_object.level1.track_inventory;

public class Items {
    String itemCode;
    String itemName;
    int itemPrice;
    private int TotalCost;
    Items(String itemCode, String itemName, int itemPrice){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        TotalCost += itemPrice;
    }
    public void display(){
        System.out.println("Item code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + itemPrice);
    }
    public void totalCost(){
        System.out.println(TotalCost);
    }

}
