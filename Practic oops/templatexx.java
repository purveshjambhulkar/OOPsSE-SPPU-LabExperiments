/*Template
Implement a generic program using any collection class
 to count the number of elements in a collection that have 
 a specific property such as even numbers, odd number, prime number and palindromes.
 */


public class templatexx {

    static boolean isPrime(int num){
        for (int i = 2; i <= num - 1; i++) {
            if(num % i == 0 ){
                return false;
            }
        }
        return true;
    }

    static <T> void count(String type, T[] arr) {

        int evencount = 0;
        int oddcount = 0;
        int primecount = 0;
        int palindromecount = 0;


        if(type.equals("even")){
            for(T element : arr){
                if(Integer.parseInt(element.toString()) % 2 ==0){
                        evencount++;
                }
            }
            System.out.println("Even Count : "+evencount);
        }else if(type.equals("odd")){
            for(T element : arr){
                if(Integer.parseInt(element.toString()) % 2 !=0){
                        oddcount++;
                }
            }
            System.out.println("Even Count : "+oddcount);
        }else if(type.equals("prime")){
            for(T element : arr){
                if(isPrime(Integer.parseInt(element.toString()))){
                        primecount++;
                }
            }
            System.out.println("Even Count : "+primecount);
        }else if(type.equals("palindrome")){

        }



    }

    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5,6,3,24,65,3,5,3,2,3,3,4,2,5,5,3};/////IMP NOT?e
        count("even" , arr);
    }

}