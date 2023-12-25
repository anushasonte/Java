//Write a function that takes in age as input and returns if that person is eligible to vote or not. 
//A person of age > 18 is eligible to vote.
package Exercise1;
import java.util.*;
public class EligibilityToVote {

    public static boolean checkElgibility (int age)  { //function declaration
        boolean isEligible = false;

        if(age>18)
        isEligible = true;

        return isEligible; //return to the caller ; not mandatory for void
       }
  
  
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        boolean isEligible = checkElgibility(age);  //function call
        if(isEligible)
        System.out.println("Person is eligible to vote!");
        else
        System.out.println("Person is not eligible to vote!");
        sc.close();
        
       }
    
}



