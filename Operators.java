/*
Binary Operators: Operates on two operands: + , - , *, / , %
Unary Operators: Operates on single operand:  ++, -- (a=a+1, a=a-1)
Relational operators: ==, != , < , > , <=, >=  //returns boolean
Logical operators: &&, ||, !
Assignment operators: =, +=, -=, *=, /=, %= [a+=b => a = a+b]

Pre increment:
++a
1. Change the value.
2. Use the value.

Post increment:
a++
1. Use the value
2. Then change the value.

Hexa-decimal: Base 16 : Memory addresses in java are stored in hexadecimal form.

Bitwise operators:
let a = 0101, b = 0110
& : AND: a & b = 0100
| : OR: a | b = 0111
^ : XOR: a ^ b = 0011
~ : COMPLIMENT: ~a = 1010
<< : Left shift : a << 1 = 1010  ; b << 1 = 1100
>> : Right shift : a >> 1 = 0010  ; b >> 1 = 0011

*/

public class Operators{

    public static void main(String[] args) {

    //Post increment
    int a = 10;
    int b = 0;

    b = a++;
    System.out.println("---POST INCREMENT---");
    System.out.println(a);
    System.out.println(b);
        

    //Pre increment
    int c = 10;
    int d = 0;

    d = ++c;
    System.out.println("---PRE INCREMENT---");
    System.out.println(c);
    System.out.println(d);


    //Post decrement
    int e = 10;
    int f = 0;

    f = e--;
    System.out.println("---POST DECREMENT---");
    System.out.println(e);
    System.out.println(f);
        

    //Pre decrement
    int g = 10;
    int h = 0;

    h = --g;
    System.out.println("---PRE DECREMENT---");
    System.out.println(g);
    System.out.println(h);
    }


}

