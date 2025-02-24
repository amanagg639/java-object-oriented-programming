package class_and_object.level1.mobile_phone;

public class Mobile {
    String Brand;
    String Model;
    int price;
    Mobile(String Brand, String Model, int price){
        this.Brand = Brand;
        this.Model = Model;
        this.price = price;
    }
    public void display(){
        System.out.println("Brand: " + Brand);
        System.out.println("Model: " + Model);
        System.out.println("Price: " + price);
    }
}
