package InterviewPrep;

class Calculator{

    public int add(int a, int b){
        System.out.println(a+b);
        return a+b;
    }

    public int add(int a, int b,int c){
        System.out.println(a+b+c);
        return a+b+c;
    }
}


//Overriding
class Animal {
    public void makesSound(){
        System.out.println("Animal makes sound!");
    }
}

class Dog extends Animal { //Method overriding! 
    public void makesSound(){
        System.out.println("Dog makes bow sound!");
    }

}

public class OverloadingVsOverriding {

    public static void main(String[] args) {

        //Overriding -> run time polymorphism -> method call is determined at runtime.
        //Same name, same method signature, same return type as that of super class method.
        //modifies the existing behavior
        //Can be achieved with inheritance only.
        Animal a = new Dog();
        a.makesSound();

        //Overloading -> compile time polymorphism -> you know which method is being called at compile time itself.
        //Same name, different method signature.
        //adds to existing behavior.
        //Can be achieved with or without inheritance.
        Calculator c = new Calculator();
        c.add(2, 3);
        c.add(1,2, 3);



    }

    
}
