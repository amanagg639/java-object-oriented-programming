package encapsulation_polymorphism_interface_and_abstract_class.LibraryManagement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LibraryItem> list = new ArrayList<>(){{
            add(new Book("Hell", "Hitler"));
            add(new Magazine("Vogue", "NYC"));
            add(new DVD("1920", "British Council"));
        }};

        list.get(1).reserveItem();

        for (LibraryItem item : list) {
            item.getLoanDuration();
            item.getItemDetails();
            item.checkAvailability();
        }
    }
}
