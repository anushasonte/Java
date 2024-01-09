package BitManipulation;
import java.util.*;

public class Findithbit {

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Enter position: ");
        int pos = sc.nextInt();

        int result = num & (1<<(pos-1));
        System.out.println(result);


        sc.close();

    }
    
}
