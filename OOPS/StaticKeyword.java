package OOPS;

/*

Static: Common for a class. Created only once in memory. 
Can be used in four ways.
1. Infront of a field.
2. Infront of a method. 
3. Static blocks: Static code blocks are used to initialise static variables. 
These blocks are executed immediately after declaration of static variables.
4. Static nested classes

*/

class Students{
    String name;
    static String school; //Infront of a field.
    static int studentCount; 

    static { //Infront of a block.
    studentCount = 100;
    }

    public static void changeSchool(String newSchool){  //Infront of a method.
        school = newSchool;
    }
}

public class StaticKeyword {

    public static void main(String[] args) {
        Students.school = "BGHS"; //Static members can be accessed without creating a new obj.

        Students s1 = new Students(); //Non static members must be accessed by creating an obj
        s1.name = "Anu";

        System.out.println(Students.school);

        Students.changeSchool("Montessori");

        System.out.println(Students.school);

        System.out.println(Students.studentCount);
        
    }
    
}
