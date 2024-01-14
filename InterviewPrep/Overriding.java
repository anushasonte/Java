package InterviewPrep;

//Overriding
class Animal { 
    private void eats(){
        System.out.println("Animal is eating");
    }
    public void makesSound(){
        System.out.println("Animal makes sound!");
    }
    static void walking(){
        System.out.println("Animal is walking!");
    }
   
}

class Dog extends Animal { //Method overriding! 
    public void makesSound(){
        System.out.println("Dog makes bow sound!");
    }
    static void walking(){
        System.out.println("Dog is walking!");
    }

}

public class Overriding {

    public static void main(String[] args) {
        Animal a = new Dog();
        a.makesSound();
        Dog.walking();
        //a.eats(); -> cannot override private methods
       // a.walks(); -> cannot override static methods
    }
    
}
