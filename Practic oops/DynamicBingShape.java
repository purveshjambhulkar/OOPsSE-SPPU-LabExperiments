
/*Dynamic Binding
Design a base class shape with two double type values
 and member functions to input the data 
 and compute_area() for calculating area of shape.
  Derive two classes: triangle and rectangle.
   Make compute_area() as abstract function 
   and redefine this function in the derived class to suit their requirements.
    Write a program that accepts dimensions of triangle/rectangle 
    and display calculated area. Implement dynamic binding for given case study.
 */
import java.util.Scanner;

abstract class Shape {
    double val1, val2;

    public void Input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Val1");
        val1 = input.nextInt();
        System.out.println("Enter the Val2");
        val2 = input.nextInt();
    }

    abstract void compute_area();
}

class Triangle extends Shape {
    double area;

    void compute_area() {
        area = (0.5) * val1 * val2;
        System.out.println("Area of Triangle : " + area);
    }
}

class rectangle extends Shape {
    double area;

    void compute_area() {
        area = val1 * val2;
        System.out.println("Area of Rectangle : " + area);
    }
}

public class DynamicBingShape {

    public static void main(String args[]) {

        Triangle T1 = new Triangle();
        T1.Input();
        T1.compute_area();

        rectangle r1 = new rectangle();
        r1.Input();
        r1.compute_area();
    }
}
