package Exercise1;

import java.util.Scanner;

public class gcd {

      public static void calculateGcd (int n1, int n2)  { //function declaration

        int gcd = 1;

        for(int i=1; i<=n1 && i<=n2 ; i++){
            if(n1%i == 0 && n2 %i==0){
                gcd = i;
            }
        }

        int lcm = (n1*n2)/gcd;
        
        System.out.println("GCD of two given numbers is: "+gcd);
        System.out.println("LCM of two given numbers is: "+lcm);
        return; //return to the caller ; not mandatory for void
       }
  
  
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        calculateGcd(num1, num2);  //function call
        sc.close();
        
       }
    
}
