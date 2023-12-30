package OOPS;

//when one class wants to inherit properties (fields, methods) of other class
//Main class - Super class / Parent class
//Inherited class - Sub class / Child class
//this is implemented using 'extends' keyword

/*
Types of inheritance:
1. Single level inheritance
2. Multi level inheritance
3. Hierarchial inheritance -> one base class + multiple child classes 
4. Hybrid inheritance -> mix of different types of inheritance.
5. Multiple inheritance -> not in java! -> uses interfaces instead.
*/


class Shape{  //Base class (or) Parent class
    String color;

    public void printColor(String color){
        System.out.println("Printing from Shape class, Color is: "+color);
    }

    public void area(){
        System.out.println("Displays area of shape!");
    }

}

class Triangle extends Shape{ //Child class -> Single level inheritance
 
    int length; //can have its own properties in addition to properties from parent class
    int breadth;
    //Triangle will have color property and printColor as it extended Shape class

    //If same method is present in both the classes, then it is called method overriding and parent methods are overridden by child class.
    public void printColor(String color){
        System.out.println("Printing from Triangle class, Color is: "+color);
    }


    public void area(int length, int breadth){
        int area = (int) (1.0/2 * length * breadth);
        System.out.println("Area of triangle: "+area);
    }

}

class EquilateralTriangle extends Triangle{ //Multi level inheritance

    int side;

    public void printColor(String color){
        System.out.println("Printing from EquilateralTriangle class, Color is: "+color);
    }
    
    public void area(int side){
        int area = (int) (1.0/2 * side * side);
        System.out.println("Area of EquilateralTriangle: "+area);
    }
}

class Circle extends Shape{ //Hierarchial inheritance. Both Triangle and Circle have same parent class
    int radius;

    public void printColor(String color){
        System.out.println("Printing from Circle class, Color is: "+color);
    }
    
    public void area(int radius){
        int area = (int) (3.1417 * radius * radius);
        System.out.println("Area of Circle: "+area);
    }


}

public class Inheritance {

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.length = 10;
        t1.breadth = 20;
        t1.printColor(t1.color);
        t1.area(t1.length, t1.breadth);


        EquilateralTriangle t2 = new EquilateralTriangle();
        t2.side = 10;
        t2.color = "Green";
        t2.printColor(t2.color);
        t2.area(t2.side);

        Circle c1 = new Circle();
        c1.color = "Pink";
        c1.radius = 7;
        c1.printColor(c1.color);
        c1.area(c1.radius);
    }
    
}
