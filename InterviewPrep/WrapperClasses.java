package InterviewPrep;

public class WrapperClasses {

    //Why wrapper classes?
    // Java is OOP. To follow strict oop, everything in java needs to be an object, so we convert 8 available primitive datatypes into objects.
    // We can now pass variables by reference.
    public static void main(String[] args) {

        int i = 10; //primitive data type

        Integer iref = new Integer(i); //Boxing (Converting primitives into objects)

        int j = iref.intValue(); //Unboxing (Extracting value from the objects)
        System.out.println(j);

        Integer kref = i; //Auto Boxing (internally it is: Integer kref = new Integer(i);)

        int k = kref; //Auto unboxing
        System.out.println(k);
        
    }
    
}
