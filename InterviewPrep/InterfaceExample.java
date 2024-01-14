package InterviewPrep;

interface ShapeInterface{

    //String shapeName; - cannot create instance var

    /* Objects cannot be created at run time. Not obj-obj inheritance
    Shape(){
        System.out.println("Object created!");
    } */

    void draw(); //by default is public abstract void draw()
}

class Circle implements ShapeInterface {

    public void draw() {
        System.out.println("Drawing circle!");
    } 
   
}

class Rectangle implements ShapeInterface {

    public void draw() {
        System.out.println("Drawing Rectangle!"); 
    } 
  
}

public class InterfaceExample {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }

    
}
