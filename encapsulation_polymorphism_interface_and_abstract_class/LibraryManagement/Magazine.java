package encapsulation_polymorphism_interface_and_abstract_class.LibraryManagement;

public class Magazine extends LibraryItem{
    public Magazine(String title, String author) {
        super(title, author);
    }

    @Override
    public int getLoanDuration(){
        this.loanDuration = (int)(Math.random()*50);
        return this.loanDuration;
    }

}