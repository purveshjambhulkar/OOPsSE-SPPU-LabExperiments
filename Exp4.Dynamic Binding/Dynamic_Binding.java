
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

    public void inputValue() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value 1");
        val1 = input.nextInt();
        System.out.println("Enter the value 2");
        val2 = input.nextInt();

    }

    abstract void compute_area();

}

class Rectangle extends Shape {
    double area;

    void compute_area() {
        area = val1 * val2;
        System.out.println("Area of the Rectangle : " + area);
        System.out.println();
    }

}

class Triangle extends Shape {
    double area;

    void compute_area() {
        area = (0.5) * val1 * val2;
        System.out.println("Area of the Triangle : " + area);
        System.out.println();
    }
}

public class Dynamic_Binding {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.inputValue();
        rectangle.compute_area();

        Triangle triangle = new Triangle();
        triangle.inputValue();
        triangle.compute_area();
    }

}