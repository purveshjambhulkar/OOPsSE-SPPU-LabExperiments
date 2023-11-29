/*Design a class ‘Complex’with data members for real and imaginary part.
 Provide default and Parameterized constructors.
  Write a program to perform arithmetic operations of two complex numbers. */

public class Complex {

    private float real;
    private float imaginary;

    Complex() {
        // default constructor
    }

    Complex(float real, float imaginary) {// parameterized constructor
        this.real = real;
        this.imaginary = imaginary;
    }

    //Method to add Two Comolex Numbers
    public Complex addComplex(Complex O1, Complex O2) {
        float finalReal = O1.real + O2.real;
        float finalImaginary = O1.imaginary + O2.imaginary;
        return new Complex(finalReal, finalImaginary);

    }

    //Method to subtract Two Complex Numbers
    public Complex subtractComplex(Complex O1, Complex O2) {
        float finalReal = O1.real - O2.real;
        float finalImaginary = O1.imaginary - O2.imaginary;
        return new Complex(finalReal, finalImaginary);

    }

    //Method to Display the Complex Numbers
    public void displayComplex() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

    public static void main(String[] args) {
        Complex num1 = new Complex(5, 10);
        Complex num2 = new Complex(2, 4);

        Complex sum = num1.addComplex(num1, num2);
        System.out.println("The sum of the Complex Numbers is : ");
        sum.displayComplex();

        Complex diff = num1.subtractComplex(num1, num2);
        System.out.println("The subtraction of the Complex Numbers is : ");
        diff.displayComplex();

    }

}
