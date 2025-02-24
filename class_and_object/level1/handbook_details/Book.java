package class_and_object.level1.handbook_details;

public class Book {
    String title;
    String author;
    int price;
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
