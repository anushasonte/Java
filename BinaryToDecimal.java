import java.util.*;
public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary number: ");
        String input = sc.next();
        int output = 0;
        int counter = 0;

        for(int i=input.length()-1;i>=0;i--){

           if(input.charAt(i) == '1'){
           output = output + (1 << counter);  // 1 << counter = 2 pow counter
           }
           counter++;
        }

    
        System.out.println("After conversion, decimal equivalent: "+output);
        sc.close();
    }
    
}

