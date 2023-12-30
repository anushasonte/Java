package OOPS;

/*
Two types:
1. Compile time polymorphism -> Method overloading -> detected during compile time
2. Run time polymorphism -> Method overriding -> no errors detected during compile time, detected during runtime.
*/

class StudentInfo{
    
    String name;
    int age;
    
    //Method overloading : same name methods in same class + different paramters
    //Rules: Must have different paramters or different return type or both.

    public void printInfo(String name, int age){
        System.out.println("Printing from method-1");
        System.out.println("Name: " +name);
        System.out.println("Age: "+age);
    }

    public void printInfo(String name){
        System.out.println("Printing from method-2");
        System.out.println("Name: " +name);
    }

    public void printInfo(int age){
        System.out.println("Printing from method-3");
        System.out.println("Age: " +age);
    }

}

public class Polymorphism {

    public static void main(String[] args) {

        StudentInfo s1 = new StudentInfo();
        s1.name = "Anusha";
        s1.age = 25;
        
        s1.printInfo(s1.name,s1.age); //Prints from method-1
        s1.printInfo(s1.name); //Prints from method-2
        s1.printInfo(s1.age); //Prints from method-3

        OOPS.Account a1 = new Account(); //From AccessModifiers.java
        a1.name = "Customer-1";
       // a1.accountNumber = 123456; private
        a1.email = "customer1@gmail.com"; 
        a1.accountType = "Savings";
        a1.printAccountInfo(a1.name,a1.accountType,a1.email);

    }
    
}
