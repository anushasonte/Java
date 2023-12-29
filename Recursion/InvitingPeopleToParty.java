package Recursion;

import java.util.Scanner;

//Find the number of ways in which u can invite n people to the party, either in pairs or single.

public class InvitingPeopleToParty {

    public static int invitePeople(int n){

        if(n==0 || n==1){
            return 1;
        }
        //single invite -> first person - single invite, remaining people: invitePeople(n-1)
        int singleWays = invitePeople(n-1);

        //pair invite -> to choose a person to pair with : (n-1) choices , remaining guests to invite : invitePeople(n-2)
        //so (n-1) * invitePeople(n-2)
        int pairWays = (n-1) * invitePeople(n-2);

        int totalWays = singleWays + pairWays;

        return totalWays;
    }


        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input n: ");
        int n = sc.nextInt();
        int totalWays = invitePeople(n);
        System.out.println("Total ways to invited: "+totalWays);
        sc.close();
        
    }
    
}
