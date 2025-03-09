package encapsulation_polymorphism_interface_and_abstract_class.EmployeeManagement;

public abstract class Employee implements IDepartment {
    int employeeId;
    String employeeName;
    double baseSalary;

    public abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Base Salary: " + baseSalary);
    }

}