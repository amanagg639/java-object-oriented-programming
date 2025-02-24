package class_and_object.level2.atm;

public class Main {
    public static void main(String[] args) {
        BankAccount hdfc = new BankAccount("Aman", 123);
        hdfc.deposit(10000);
        hdfc.withdraw(20000);
        hdfc.display();
    }
}
