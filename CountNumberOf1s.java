import java.util.*;
public class CountNumberOf1s {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary number: ");
        String input = sc.next();
        int output = 0;

        for(int i=input.length()-1;i>=0;i--){
           if(input.charAt(i) == '1'){
           output ++;  // 1 << counter = 2 pow counter
           }
        }

    
        System.out.println("Number of 1s in binary: "+output);
        sc.close();
    }
    
}


