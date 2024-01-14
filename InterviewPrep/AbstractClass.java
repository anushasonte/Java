package InterviewPrep;

//does not make sense to create an obj of shape
/*class Shape {
    void draw(){
        System.out.println("Drawing a shape!");
    }
}*/


//we cannot create objects of abstract class. They are created at runtime.
abstract class Shape {

    String shapeName; //can have instance var

    Shape(){ //constructor
        System.out.println("Constructing a shape object");
    }

    //rules are defined by parent and followed by child.
    abstract void draw(); //abstract method - no definition, child has to mandatorily define this method.

    void numSides(int x){ //non-abstract method
        System.out.println("Number of sides in given shape: "+x);
    }
}


class Circle extends Shape { //Object to Object inheritance
    void draw(){
        System.out.println("Drawing a Circle!");
    }
}

class Rectangle extends Shape {
    void draw(){
        System.out.println("Drawing a Rectangle!");
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        /*Shape s = new Shape();
        s.draw(); */

        Shape s;

        s = new Circle(); //run time polymorphism
        s.draw();
        s.numSides(0);

        s = new Rectangle();
        s.draw();
        s.numSides(2);
        
    }
    
}
