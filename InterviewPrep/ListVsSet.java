package InterviewPrep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class ListVsSet {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
       // List<Integer> list1 = new LinkedList<>();
       //List<Integer> list2 = new Vector<>();
       //List<Integer> list3 = new Stack<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30); //allows duplicates 
        list.add(null);
        list.add(null); //allows multiple null values

        System.out.println(list); //maintains order of insertion

        Set<Integer> set = new HashSet<>();
        //Set<Integer> set1 = new TreeSet<>(); -> sorted order
       // Set<Integer> set2 = new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30); //does not allow duplicates
        set.add(null); 
        set.add(null); //does not allow duplicates so this null will not be there.

        System.out.println(set); //does not maintain the order of insertion

        
    }
    
}
