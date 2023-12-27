//Get bit : get the bit a particular position
//set bit : set the bit a particular position to 1
//clear bit : set the bit to 0 at the position
//update bit: update bit at a particular position by taking input position and the bit.

//Numbering for position starts from L to R

//Steps: Perform bit mask then perform AND operation
//Get: Bitmask: 1 << pos ; Bitmask & input
//Set: Bitmask: 1 << pos ; Bitmask | input
//Clear: Bitmask: 1 << pos ; !Bitmask & input
//Update: 
//For 1 => 0 : Clear : Bitmask: 1 << pos ; !Bitmask & input
//For 0 => 1 : Set : Bitmask: 1 << pos ; Bitmask | input


public class BitwiseManipulation {
    public static void main(String[] args) {

        //Get bit: Get the 3rd bit of number n = 0101
        //Bit mask: 1 << i 
        //0001 << 2 = 0100
        //AND: 0101 AND 0100 = 0100
        //If result is non zero : bit is 1, else bit is 0. 
        //Result is non zero, so bit is 1. 

        int n = 5; //0101
        int pos = 3; //Get bit at 3rd position : 0

        int bitmask = 1 << pos;

        if((bitmask & n) == 0)
        System.out.println("Bit was 0");
        else
        System.out.println("Bit was 1");


        //set bit: Bitmask: 1 << pos ; Bitmask | input
        int m = 5; //0101
        int position = 1; //Make position 1 as 1.
        int newbitmask = 1 << position;
        int newNumber = newbitmask | m;
        System.out.println(newNumber); //0111

        //clear bit:
        int input = 5; //0101
        int posi = 2; //Make position 2 as 0.
        int newmask = 1 << posi;
        int newNum = (~newmask) & input;
        System.out.println(newNum); //0001

        //update bit:
        int inputNumber = 5; //0101
        int updateAtPosition = 0; //Update position 0
        int operation = 0;  //can be 0/1
        int maskForUpdate = 1 << updateAtPosition;
        int outputNumber = 0;

        if(operation == 1){ //Set Operation
            outputNumber = maskForUpdate | inputNumber;
        }
        else{ //Clear Operation
            outputNumber = (~maskForUpdate) & inputNumber;
        }

        System.out.println(outputNumber); //0100
    
        
    }
    
}
