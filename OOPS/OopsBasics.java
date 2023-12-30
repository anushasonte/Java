package OOPS;

class Pen{ //class name starts with capital letter
    String color;
    String type;

    public void write(){ //method names start with small letter
        System.out.println("Writing with "+color+ " "+type+ " pen");
    }

    public void printColor(){
        System.out.println(this.color); //used to specify the object which is being called.
    }
}



public class OopsBasics {

    public static void main(String[] args) {

        Pen pen1 = new Pen();  //Objects are created using new keyword. Memory is allocated for this object.
        pen1.color = "Blue";
        pen1.type = "Ballpoint";
        pen1.write();
        pen1.printColor();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Gel";
        pen2.write();
        pen2.printColor();

        
        
    }
    
}
