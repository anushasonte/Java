package OOPS;

/*
Interface is other way to implement abstraction in java.
Propeties:
1. Using interface keyword
2. Cannot have constructors.
3. Cannot have non abstract members. All methods are public, abstract by default.
4. All fields are public, static and final by default.
5. If a class implements an interface, it must provide implementation for all methods present in the interface.
6. A class can implement multiple interfaces. 
*/


interface Animals{
    void walk();
    void eat();
}

interface Herbivore{
    void eatsPlants();
}

class Horses implements Animals, Herbivore{
    int eyes=4;
    public void walk(){
        System.out.println("Horse is walking!");
    }
    public void eat(){
        System.out.println("Horse is eating!");
    }
    public void eatsPlants(){
        System.out.println("Horse eats plants!");
    }
   
}

public class Interfaces {

    public static void main(String[] args) {

        Horses h1 = new Horses();
        h1.eat();
        h1.walk();
        h1.eatsPlants();
        
    }
    
}
