package class_and_object.level2.atm;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    int balance;
    BankAccount(String accountHolder, int accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }
    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        if(balance<amount) System.out.println("Not Enough Balance");
        else balance -= amount;

    }
    public void display(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Total Balance: " + balance);
    }
}
