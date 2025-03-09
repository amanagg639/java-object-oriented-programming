package inheritance.Assisted_Problems.EmployeeManagementSystem;

public class Intern extends Employee{
    private int duration;
    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Duration : "+duration);
    }

}