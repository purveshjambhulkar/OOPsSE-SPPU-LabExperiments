/*Template
Implement a generic program using any collection class
 to count the number of elements in a collection that have 
 a specific property such as even numbers, odd number, prime number and palindromes.
 */

public class Template {

    static boolean isPrime(int num){
        int flag = 0 ;
            for(int i = 2 ; i < num ; i++){
                if (num % i == 0) {
                    flag = 1;
                }
            }
            if (flag == 1) {
                return false;
            }
            else{
                return true;
            }
        }    

    static <T> void count (String type , T[] arr ){

            
        int even_count = 0;
        int odd_count = 0;
        int prime_count = 0;
        int palindrome = 0; 

        if (type.equals("even")) {
            for(T element : arr){
                if (Integer.parseInt(element.toString()) % 2== 0) {
                    even_count++;
                }
            
            }
            System.out.println("Even numbers are : "+even_count);
        }else if (type.equals("odd")) {
            for(T element : arr){
                if (Integer.parseInt(element.toString()) % 2 != 0) {
                    odd_count++;
                }
            }
            System.out.println("Odd numbers are : "+odd_count);}
        else if (type.equals("prime")) {
            for(T element : arr){
                if (isPrime(Integer.parseInt(element.toString()))) {
                    prime_count++;
                }
            }
            System.out.println("Prime numbers are : "+prime_count);
        }else if (type.equals("palindrome")) {
            for(T element : arr){
                StringBuffer rev = new StringBuffer(element.toString());
                if ((element.toString()).equals(new String(rev.reverse()))) {
                  palindrome++;  
                }
            }
            System.out.println("Palindrome Count is : "+palindrome);
        }
        
    }

    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5,6,6,7,8,9,45,89,99};
        count("even", arr);
        count("odd", arr);
        count("prime", arr);
        count("palindrome", arr);

    }
    
}