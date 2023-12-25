public class Variables {

    public static void main (String args[])
    {
        //Value of constants does not change whereas value of variables can change.

        //Java is a typed language. Need to specify the type of variable before defining it so that memory can be allocated accordingly.

        //Data types are of two types

        /*1. Primitives : 8 datatypes: 
           Byte (1 byte memory)
           short (2 bytes memory)
           char (2 bytes memory)
           boolean (1 bytes memory)
           int (4 bytes memory)
           float (4 bytes memory)
           long (8 bytes memory)
           double (8 bytes memory)
        */
        //2. Non Primitives: Customizable. Can vary in size.


        String name = "Anusha";
        int age = 25;
        short size = 4;
        long timestamp = 246239864;
        float weight = 65.2f;
        double price = 25.25;
        boolean isMarried = false;

        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
        System.out.println("Size is : "+size);
        System.out.println("Timestamp is : "+timestamp);
        System.out.println("Weight is : "+weight);
        System.out.println("Price is : "+price);
        System.out.println("Marital status is : "+isMarried);


        int a=20;
        int b=10;
        int sum = a + b;
        System.out.println(sum);

        //Parenthesis are important 
        System.out.println((a+b)/(a-b));

    }
    
}
