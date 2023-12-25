public class Loops {

    // for, while, do-while

    public static void main(String[] args) {

    //Using loops

    //for loop
    /*
      for(initialization; condition for termination ; updation)
      {
        //do something
      }
     */

    System.out.println("Using FOR loop: ");

    // for(int i=0; ; i++){} //infinite-loop
    //  for(; ; ) //infinite loop


    //Printing numbers from 0 to 10
    for(int i=0; i<11; i++)
    {
        System.out.print(i + " ");
    }

    System.out.println("\nWHILE LOOP: ");

    //while loop
    /*
      while(condition for termination)
      {
        //do something
      }
     */

    // Check condition and then do something

    int j=0;
    while(j<11)
    {
        System.out.print(j + " ");
        j++;
    }

    System.out.println("\nD0 WHILE LOOP: ");

    // do while loop
    /*
      do
      {
        //do something
      } while(condition for termination);
     */

     // Do something and check conditon, so even if condition is false, it will be executed atleast once.  
    
    int k=0;
    do
    {
        System.out.print(k + " ");
        k++;
    }while(k<11);


    //Difference between while and do while

    int i = 12;

    while(i<11)
    {
        System.out.println("Inside while");
    }

    do
    {
        System.out.println("\nInside do-while");
    }while(i<11);

        
  }
    
}
