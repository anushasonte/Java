package OOPS;


class Student{
    String name;
    int age;
    
    //Below is a non parameterized contructor, it is called only once during the object creation. 
    //Does not have any return type and has the same name as that of a class.
    //If no non-parameterized constructor is defined, a default contructor is called by itself by java.
    Student(){
        System.out.println("Non parameterized constructor called!");
    } 

    //Parameterized constructor
    Student(String name, int age){
        System.out.println("Parameterized constructor called!");
        this.name = name;
        this.age = age;
    }

    //Copy constructor
    Student(Student s){
        System.out.println("Copy constructor called!");
        this.name = s.name;
        this.age = s.age;
    }

    public void printName(){
        System.out.println("Name: " +this.name);
    }

    public void printAge(){
        System.out.println("Age: "+this.age);
    }
}

public class Constructors {

    public static void main(String[] args) {

        Student s1 = new Student(); //Student() -> call to non paramterized contructor or default contructor.
        s1.name = "Anusha";
        s1.age = 25;
        s1.printName();
        s1.printAge();

        Student s2 = new Student("Varun", 25); // -> call to paramterized contructor
        s2.printName();
        s2.printAge();

        Student s3  = new Student(s2); //Call to copy constructor
        s3.printName();;
        s3.printAge();

    }
    
}
