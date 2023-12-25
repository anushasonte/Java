import java.util.*;
public class TakingInput {

    public static void main(String args[])
    {
        //Taking input fromm user 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next(); //takes one string at a time
        // Input buffer: "Anu\n"
        System.out.println("Name entered is: " +name);

        System.out.print("Enter age: ");
        int age = sc.nextInt(); //takes one string at a time
        // Input buffer: "\n"
        System.out.println("Age entered is: " +age);

        sc.nextLine();
        // Input buffer: ""

        System.out.print("Enter mood: ");
        String mood = sc.nextLine(); //takes one string at a time
        System.out.println("Mood  is: " +mood);

        sc.close();


        //nextBoolean()
        //nextInt()
        //nextFloat()
        //nextDouble()
        //nextLong()
        //nextShort()
        //nextByte()

    }


    
}
