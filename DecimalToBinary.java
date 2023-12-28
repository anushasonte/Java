import java.util.*;
public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter decimal number: ");
        int input = sc.nextInt();
        int quotient = 0;
        int remainder = 0;

        StringBuilder binary = new StringBuilder();

        while(!(input < 1)){
            quotient = input/2;
            remainder = input % 2;
            binary.append(Integer.toString(remainder));
            input = quotient;
            if(input == 0){
            break;
            }
        }

        System.out.println("After conversion, binary equivalent: "+binary.reverse());
        sc.close();
    }
    
}
