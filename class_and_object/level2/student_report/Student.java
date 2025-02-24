package class_and_object.level2.student_report;

public class Student {
    String name;
    int rollNO;
    int marks;
    Student(String name, int rollNO, int marks){
        this.name = name;
        this.rollNO = rollNO;
        this.marks = marks;
    }
    String grade;
    public void calculateGrade(){
        if(marks>90) grade = "O";
        else if(marks>=85) grade = "A+";
        else if(marks>80) grade = "A";
        else if(marks>70) grade = "B";
        else grade = "F";
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNO);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
