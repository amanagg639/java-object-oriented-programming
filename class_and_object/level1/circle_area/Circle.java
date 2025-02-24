package class_and_object.level1.circle_area;

public class Circle {
    int radius;
    Circle(int radius){
        this.radius = radius;
    }

    public void findAreaAndCircumference(){
          double area = Math.PI*radius*radius;
          double circumference = 2*(Math.PI*radius);
        System.out.println("Area: " + area);
        System.out.println("circumference: " + circumference);
    }
}
