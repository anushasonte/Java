package BitManipulation;
import java.util.*;

//Using N & 1 = 1 => odd, else even
//If LSB (Least Significant bit) is 1=> odd, else even

public class EvenOdd {

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if((num & 1) == 1){
            System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is even");
        }


        sc.close();
    }
    
}
