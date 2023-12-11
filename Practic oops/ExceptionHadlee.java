
/*Exception handling
Implement a program to handle Arithmetic exception,
 Array Index Out of Bounds.
  The user enters two numbers Num1 and Num2. 
  The division of Num1 and Num2 is displayed. 
  If Num1 and Num2 are not integers,
   the program would throw a Number Format Exception.
    If Num2 were zero, the program would throw an Arithmetic Exception.
     Display the exception.
 */
import java.util.Scanner;

public class ExceptionHadlee {
    public static void main(String[] args) {

        // Array out the Bound Exception
        try {
            int arr[] = new int[10];
            arr[15] = 888;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException : " + e);
        }

        // Arithmtic Exception & NumberFormatException
        try {
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            int deno = input.nextInt();
            int div = num / deno;
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException : " + e);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticExceptio : " + e);
        }

    }
}
