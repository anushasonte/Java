import java.util.*;
public class ConditionalStatements {

    //if-else, else if, switch, break

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //if-else
        /* 
        SYNTAX: 
        if(condition)
         {

         }
        else
         {

         }
         */

        /*  

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are an adult!");
        }
        else{
            System.out.println("You are not an adult!");
        }

        System.out.println("USING IF-ELSE: ");
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        if(a > b) {
            System.out.println("a is greater");
        }
        else{
            if(a == b){
                System.out.println("a is equal to b");
            }
            else{
                System.out.println("a is less than b");
            }
        } */

        //if - else if - else
        /* 
        SYNTAX: 
        if(condition) //No need of curly braces if only one statement needs to be executed after if
         {

         }
        else if
         {

         }
        else
         {

         }
         */

        /* 

        System.out.println("USING ELSE IF: ");
        System.out.println("Enter a: ");
        int a1 = sc.nextInt();
        System.out.println("Enter b: ");
        int b1 = sc.nextInt();

        if(a1 > b1) {
            System.out.println("a is greater");
        }
        else if(a1 == b1){
            System.out.println("a is equal to b");
        }
        else {
            System.out.println("a is less than b");
        }

        System.out.println("GREETINGS USING IF-ELSE: ");
        System.out.println("Enter button number: ");
        int button = sc.nextInt();

        if(button == 1) {
            System.out.println("Hello");
        }
        else if(button == 2){
            System.out.println("Namaste");
        }
        else if(button == 3){
            System.out.println("Bonjour");
        }
        else {
            System.out.println("Invalid button");
        }

        */

        //SWITCH
        /* 
        SYNTAX: 
        switch()
        {
            case 1: 
            break;
            case 2: 
            break;
            default:
            break;
        }
        */

        System.out.println("GREETINGS USING SWITCH: ");
        System.out.println("Enter button number: ");
        int option = sc.nextInt();

        switch(option)
        {
            case 1: System.out.println("Hello");
                    break; //comes out of that switch
            case 2: System.out.println("Namaste");
                    break; 
            case 3: System.out.println("Bonjour");
                    break;
            default: System.out.println("Invalid button");
            //no need of break after default as it comes out of switch anyways
        }    

       sc.close();   
        
    }   
}
