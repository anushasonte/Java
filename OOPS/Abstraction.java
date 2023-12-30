package OOPS;

/*
Abstraction: Hiding implementation details.
Two ways to implement:
1. Using abstract classes
2. Using interfaces

Abstract class properties:
1. An abstract class must be declared with abstract keyword.
2. Abstract classes can have abstract and non abstract methods.
3. Cannot instantiate. i.e., cannot create an obj of abstract class.
4. It can have constructors and static methods.
5. It can have final methods, these methods can be overridden by child class.
*/


//
abstract class Animal{ //An abstract class must be declared with abstract keyword.
   
    abstract void walk(); //abstract methods have no implementation.
   
   public void eat(){ //Abstract classes can have abstract and non abstract methods.
    System.out.println("Animal eats!");
   }

   Animal(){  //It can have constructors and static methods.
    System.out.println("New Animal created!");
   }

   final public void sleeps(){
    System.out.println("Animal is sleeping..");
   }
}

class Horse extends Animal{
    Horse(){
        System.out.println("New Horse created!");
    }
    public void walk(){
        System.out.println("Horse walking..");
    }

    /*public void sleeps(){ //gives error saying final method can be overrridden.

    }  */

}

class Chicken extends Animal{
    Chicken(){
        System.out.println("New Chicken created!");
    }
    public void walk(){
        System.out.println("Chicken walking..");
    }

}

public class Abstraction {

    public static void main(String[] args) {

        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
        h1.sleeps();

        //Animal a1 = new Animal(); //Cannot instantiate. i.e., cannot create an obj of abstract class.
        
    }
    
}
