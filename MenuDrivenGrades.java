/* 
Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)
*/

import java.util.*;
public class MenuDrivenGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 1;
        
        do
        {
            System.out.println("Enter input: ");
            input = sc.nextInt();

            if(input==0)
            break;

            int marks = sc.nextInt();

            if(marks >= 90) {
                System.out.println("This is Good");
            }
            else if(marks>=60 && marks<=89){
                System.out.println("This is also Good");
            }
            else{
                System.out.println("This is also Good, Because marks don’t matter but our effort does.");

            }


        }while(input==1);

        sc.close();
    }
    
}
