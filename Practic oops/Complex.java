public class Complex {
    private float real;
    private float imaginary;

    Complex() {

    }

    Complex(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;

    }

    public Complex AddComplex(Complex O1, Complex O2) {
        float finalReal = O1.real + O2.real;
        float finalImaginary = O1.imaginary + O2.imaginary;
        Complex sum = new Complex(finalReal, finalImaginary);
        return sum;
    }

    public Complex SubComplex(Complex O1, Complex O2) {
        float finalReal = O1.real - O2.imaginary;
        float finalImaginary = O1.imaginary - O2.imaginary;
        Complex Sub = new Complex(finalReal, finalImaginary);
        return Sub;
    }

    public void Display() {
        System.out.println("Complex Numbers");
        System.out.println(this.real + " + " + this.imaginary + " j");

    }

    public static void main(String args[]) {
        Complex num1 = new Complex(4, 2);
        Complex num2 = new Complex(1, 1);

        Complex Sum = num1.AddComplex(num1, num2);
        Sum.Display();

        Complex Sub = num1.SubComplex(num1, num2);
        Sub.Display();
    }

}
