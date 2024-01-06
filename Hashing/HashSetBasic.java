package Hashing;

import java.util.HashSet;
import java.util.Iterator;

/*
Set is a data-strcuture consists of unique elements only. (does not allow duplicates). No guarantee of order of insertion. (unordered)
Arraylist allowed duplicates.
Important bcoz of its time complexity.
Insertion : O(1)
Delete : O(1)
Search : O(1)

Syntax: HashSet<Datatype> hashSetName = new HashSet<>();
*/

public class HashSetBasic {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();

        //insertion
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2); //Ignored as it is duplicate
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        System.out.println("After addition: " +hashSet.size());
        System.out.println(hashSet);

        //search
        System.out.println("Does hashset contain 2? " +hashSet.contains(2));
        
        //delete
        hashSet.remove(2);
        System.out.println(hashSet);
        System.out.println("Does hashset contain 2? " +hashSet.contains(2));

        //printing elements in set
        System.out.println("Printing all elements in set: "+hashSet);

        //using iterator to traverse
        System.out.println("Traversing all elements in hashset using iterator: ");
        Iterator it = hashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
