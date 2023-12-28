import java.util.*;
public class IsPowerOf2 {

     public static boolean checkIfPowerOfTwo(int number){
            boolean isPowerOf2 = false;

            if(number == 0){
                return false;
            }

            while(number != 1){
                if(number % 2 != 0){
                    return false;
                }
                number = number/2;
            }
            isPowerOf2 = true;
            
            return isPowerOf2;
        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter decimal number: ");
        int input = sc.nextInt();
        
        System.out.println(checkIfPowerOfTwo(input) ? "True" : "False");
       
        sc.close();
    }
    
}


