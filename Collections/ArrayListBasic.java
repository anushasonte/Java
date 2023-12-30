package Collections;
import java.util.ArrayList;
import java.util.Collections;

/*
Array is a fixed size contigious block. Cant change size of array after declaration. Arrays stores primitives and objects. (int, float, Strings, double, boolean, long, short, char)
Arraylist is a variable sized array! Memory is not stored in contigious blocks. Stores objects only. 
Arraylist is stored in heap. 

Declaration: ArrayList<Datatype> arrayListName = new ArrayList<Datatype>();
(or)
ArrayList<Datatype> arrayListName = new ArrayList<>();

Datatype = Integer | String | Float | Boolean etc.
*/

public class ArrayListBasic {

    public static void main(String[] args) {

        ArrayList<Integer> alist = new ArrayList<>();
        ArrayList<String> blist = new ArrayList<>();

        //add() -> adds an element to arraylist
        System.out.println("-----add()-------");
        alist.add(10);
        alist.add(20);
        alist.add(30);
        alist.add(40);

        System.out.println(alist);

        blist.add("Anusha");
        blist.add("Sonte");

        System.out.println(blist);

        //get() -> gets an element from arraylist -> indexing starts from 0.
        System.out.println("-----get()-------");
        System.out.println(alist.get(0));
        System.out.println(alist.get(1));

        //size()
        System.out.println("-----size()-------");
        int size = alist.size();
        System.out.println("Size of array list: "+size);

        //add at particular index
        System.out.println("-----add at index-------");
        alist.add(0,100); //adds 100 at the beginning does not delete the existing element present at the index.
        System.out.println(alist);

        //set
        System.out.println("-----set()-------");
        alist.set(0,200); //update 200 at index 0 
        System.out.println(alist);

        //remove
        System.out.println("-----remove()-------");
        alist.remove(4); //removes 40
        System.out.println(alist);

        //iterating using loops
        System.out.println("-----iterate using loops-------");
        for(int i=0; i<alist.size();i++){
            System.out.println(alist.get(i));
        }

        //sort
        System.out.println("-----sort()-------");
        Collections.sort(alist);
        System.out.println(alist);

        //clear()
        System.out.println("-----clear()-------");
        alist.clear();
        System.out.println("Size of array list: "+alist.size());
    }
    
}
