package class_and_object.level1.employee_details;

public class Employe {
    String name;
    int id;
    int salary;
    Employe(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void display(){
        System.out.println("Name " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
