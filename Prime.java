//Check if entered number is prime or not
import java.util.*;
public class Prime{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if(n<2){
            isPrime = false; //bcoz 0 and 1 are not prime
        }

        for(int i=2; i<= n/2; i++) //Starting from 2 till sqrt of that number
        { 
            if(n%i==0)  //if number divided by i is 0, then not prime
            {
                 isPrime = false;
            }
        }

        if(isPrime == true)
        System.out.println("Entered number is Prime!");
        else
        System.out.println("Entered number is not Prime!");



    sc.close();
        
    }


    
}

