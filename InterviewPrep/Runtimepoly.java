package InterviewPrep;

class Shape {
    void draw(){
        System.out.println("Drawing a shape!");
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

public class Runtimepoly {

    public static void main(String[] args) {

        //Compile time polymorphism
        Circle c = new Circle();
        c.draw(); //call is resolved at compile time.

        //Run time polymorphism: Ref variable of parent class is used to create child class
        Shape s = new Circle();
        s.draw();  //Determination of the method call is based on the obj being referenced. Call is resolved at runtime.
        //this is also called dynamic method dispatch
        
    }
    
}
