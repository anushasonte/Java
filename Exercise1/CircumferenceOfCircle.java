//Write a function that takes in the radius as input and returns the circumference of a circle.

package Exercise1;
import java.util.*;
public class CircumferenceOfCircle {

    public static void calculateCircumference (int radius)  { //function declaration
        double circumference = 2 * 3.1417 * radius;
        System.out.println("Circumference of the circle with radius " + radius + " is: "+circumference);
        return; //return to the caller ; not mandatory for void
       }
  
  
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = sc.nextInt();
        calculateCircumference(radius);  //function call
        sc.close();
        
       }
    
}


