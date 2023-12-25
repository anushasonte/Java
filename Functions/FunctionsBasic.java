package Functions;
import java.util.*;
public class FunctionsBasic {

    //It is a block of code that performs certain operation based on given input and gives output.

    //Syntax:
    /*
     keywords/accessmodifiers returntype functionname (type arg1, type arg2..)
     {
        //operation
        //if return type is void -> it does not return anything, example: public static void main()
        //the function_name should not be a keyword
        return ;
     }
     */

     //What happens in memory after creating a function?
     /*
      All functions are stored in the stack in the form of stack frame. Stack frame contains all required variables etc. 
      So, the first stack frame in stack would be of main()
      If main, calls any new functions, a new stack frame is created it would on top of main(). 
      Once new function returns or completes execution, then it would be popped out of stack. 
      Similarly, after main completes execution, it would be removed from stack frame.
      */

      /* Functions vs Methods
       Functions can be called directly. Methods are called by creating an object of that class.
       */

     public static void printName (String name)  { //function declaration
      System.out.println("Name is: "+name);
      return; //return to the caller ; not mandatory for void
     }


     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter name: ");
      String name = sc.next();
      printName(name);  //function call
      sc.close();
      
     }
     


    
}
