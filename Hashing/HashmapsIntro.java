package Hashing;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeMap;

/*
Getting element in O(1) time.
Storing in array : O(n) time. -> linear search
Binary search tree: O(log n) time

Hashmap:
Stores data in the form of key-value pairs. Not in sorted order.
For sorted order -> use TreeMap
There is no traversal involved. map.get("key") -> gives the value.

Real-world implementations:
1. In compilers and interprators -> to point the names to variables
2. In network routers -> router name vs ip address
3. In network servers 
4. Virtual memory - linked to physical memory
5. String search using grep command.

How hashmaps work?
Based on hashcode. 
Hashcode -> any input - gives output in the form of integer.

Two problems:
1. We need all elements as positive numbers. -> using hashcode function
2. Hashcode can be very large -> reduce it. -> reduce all elements in the table to a size 'n'.

While insertion (Internally):
1. Take input "anusha" and give it to hashCode() and get the hashcode. ex: hashcode: 1966081508 (same value -> same hashcode)
2. Hashing -> to convert variable size input into fixed size output. -> hash function depends on the internal implementation. 
There may be collisions! 

2 ways to resolve collisions:
1. Chaining
2. Open addressing

Chaining: 
At every element in the array there might be a linkedlist. So if multiple elements have the same index, all of them will be 
chained together in the form of linkedlist at the same index.
Worst case scenario: all the elements are chained at the single index. -> here T.C = O(n)

How to avoid this problem?
Try out best to make sure that not all elements fall on the same index. -> using simple uniform hashing.

Assumption: every key is equally likely to be present at any index in the table.
If n -> number of keys and m -> size of hashtable, the load factor (alpha)= n/m; (expected keys per slot)
So, now TC = O(1 + list search) = O(1 + alpha) => O(1) //if alpha's TC = O(1)

What hash functions are used?
1. Division method : h(k) = k%m //m is size of array or a prime number
2. Multiplication method: h(k) = ( a * k ) % (2 ^ m) >> (w-r) //a is random number, w is number of bits in k, m is (2^r) //mostly used.
3. Univeral hashing: h(k) = ((a.k + b) % p ) % m //a, k are random numbers and p is a large prime number.

What should be the size of the table?
m = Tita (n)
if size is small - table will be slow
if size is big - wasting resources
Idea: start small and then grow -> usually doubles the size once the table is full. (same for arraylist as well)
If growing one element at a time: T.C = O(1+2+3+..n) = O(n^2)
If doubling : T.C = O(1+2+4+8+16+..) = O(n)

Open addressing: 
No chaining, use table slots only. 
Idea : only one item per slot. (so size of table  >= number of items)
First, generate the hash hash(33, 0) - for first try, if full, keep trying (probing) until empty index is found. 
Probing strategies:
1. Linear probing : h(k,i) = (h(k) + i ) % m
2. Double hashing : h(k, i) = (h1(k) + i * h2(k)) % m //h1, h2 are hash functions

When to use open addressing (or) Chaining?
Open addressing - gives better memory util and caching - as no pointers needed.
Chaining - less sensitive to hash functions


While fetching:
To get value of "anusha" : haschode("anusha") = index! go to this index and fetch value.

*/

public class HashmapsIntro {

    public static void main(String[] args) {

        //hashmap internally
        String name = "Anusha";
        int hashcode = name.hashCode();
        System.out.println(hashcode);   
        
        HashMap<String, Integer> marks = new HashMap <> ();
        marks.put("Anusha", 100);
        marks.put("Anusha", 99);
        marks.put("", 98);
        marks.put("", 97);
        marks.put("Varun", 90);
        marks.put("Maee", 95);

        System.out.println(marks); //not sorted 


        //Get value
        System.out.println(marks.get("Anusha")); 
        //if two keys have the same value, the value is overridden. No duplicate keys stored. 
        //Empty string is a valid key. Allows one null key and multiple null values.


        //Gets the value from the map if present, else returns the default value, does not insert in the hashmap.
        System.out.println(marks.getOrDefault("Sonte", 70));

        System.out.println(marks.containsKey("Varun"));
        System.out.println(marks.containsValue(100));

        System.out.println("Size of hashmap: " +marks.size());


        //hashset
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(43);
        hashSet.add(100);
        hashSet.add(80);
        hashSet.add(63);
        hashSet.add(20);
        hashSet.add(20);

        System.out.println(hashSet);
        //Not sorted, does not guarantee insertion order, no duplicates.


        //Tree map
        TreeMap<String, Integer> treeMap = new TreeMap <> ();
        treeMap.put("Anusha", 100);
        treeMap.put("Varun", 90);
        treeMap.put("Maee", 95);
        treeMap.put("Sonte", 98);
        treeMap.put("", 97);

        System.out.println(treeMap); //sorted as per key
        //Allows one null key and multiple null values


        //Hashtable does not allow null values.
    }

    
}
