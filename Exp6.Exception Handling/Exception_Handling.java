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

public class Exception_Handling {

    public static void main(String[] args) {

        // Array index out of the bound
        try {
            int arr[] = new int[10];
            arr[15] = 5;// this will throw error

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException : " + e);
        }

        // division exception handling

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter num 1");
            int num1 = Integer.parseInt(input.next());
            System.out.println("Enter num 2");
            int num2 = Integer.parseInt(input.next());
            int result = num1/num2 ;
        } catch (ArithmeticException e) {
            System.out.println("Denominator in Zero : "+e);
        }
        catch(NumberFormatException e){
            System.out.println("Input is invalid : "+e);
        }

    }
}
