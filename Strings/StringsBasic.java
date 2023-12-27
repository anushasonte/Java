package Strings;
import java.util.*;

//String is also a non primitive datatype.
//Strings are immutable!

public class StringsBasic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //String declaration
        String name = "Anusha";
        String fullName = "Anusha Sonte Parameshwar"; //spaces are allowed
        
        System.out.println(name);
        System.out.println(fullName);

        System.out.println("Enter your name: ");
        //String inputName = sc.next(); //Will only take till next space.
        String inputName1 = sc.nextLine();

        
        //System.out.println("Entered name is: "+inputName);
        System.out.println("Entered name is: "+inputName1);

        sc.close();
        
    }
    
}
