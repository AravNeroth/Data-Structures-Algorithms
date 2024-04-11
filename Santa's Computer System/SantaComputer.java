/*
name: Arav Neroth
date: 12.15.23 - 12.22.21
class: Computer Science 3 | 3rd Period
Semester 1 Project
 */


import java.util.*;

public class SantaComputer {

String name, address;
ArrayList niceList;
ArrayList naughtyList;
Stack wishlist;

Map<String, SantaComputer> activitiesMap;

boolean nice;

public SantaComputer(String name, String address){
    this.name = name;
    this.address = address;
    niceList = new ArrayList<>();
    naughtyList = new ArrayList<>();
    wishlist = new Stack<>();
    activitiesMap = new HashMap<>();
}

/*
(Naughty or Nice decider method)
Has a child class with a method to mark a child as naughty or nice based on the comparative lengths of
their naughty and nice list of actions. A tie in length is considered to be naughty.
 */
    public int getChildScore() {
        return (niceList.size() - naughtyList.size());
    }

    public void addChild(String name, SantaComputer child) {
        activitiesMap.put(name, child);
    }

    public String getName() {
       return name;
    }

    public String getAddress() {
        return address;
    }

    public void addActivity(String name, String activity, boolean nice) {
        SantaComputer kid = activitiesMap.get(name);
        if (kid != null) {
            kid.addActivity(activity, nice);
        }
    }

    public String getNiceDeeds() {
        return niceList.toString();
    }
    public String getNaughtyDeeds() {
        return naughtyList.toString();
    }
    public String getWishlist() {
        return wishlist.toString();
    }
    /*
    (Add methods for naughty / nice stack)
    Has methods for “spy elves” to add naughty or nice activities to a child’s list as they happen in real time.
    */

    public void addActivity(String activity, boolean nice) {
        if (nice)
            niceList.add(activity);
        else
            naughtyList.add(activity);
    }

    public void weeklyWishlistUpdate() {
    /*
       (Naughty or Nice weekly method that adds / removes to stack)
       checks if a child is currently considered naughty or nice.
         If naughty, a present is removed from their stack, but if their stack is already empty or has coal, a piece of coal is added.
       If nice, check their stack for coal, if present, remove a piece.
       If nice and their stack has no coal, then add a toy.
    */
        // if stack is empty or not empty & has more nice than naughty, add tuna
         if ((wishlist.isEmpty() && getChildScore() > 0))
                wishlist.add("Spicy Tuna Rolls");

             // if stack is empty & has even amt of nice & naughty, add coal
             else if(wishlist.isEmpty() && getChildScore() <= 0)
                wishlist.add("Coal");



            else if(!wishlist.isEmpty() && getChildScore() > 0 && wishlist.peek().equals("Spicy Tuna Rolls"))
                wishlist.add("Spicy Tuna Rolls");

            else if(!wishlist.isEmpty() && getChildScore() > 0 && wishlist.peek().equals("Coal"))
                wishlist.pop();


             // if stack is NOT empty & has LESS/even nice than naughty, check if coal, then add
            else if(!wishlist.isEmpty() && getChildScore() <= 0 && wishlist.peek().equals("Coal"))
             wishlist.add("Coal");

             // if stack is NOT empty & has tuna and a lower nice than naughty, remove coal
            else if(!wishlist.isEmpty() && getChildScore() <= 0 && wishlist.peek().equals("Spicy Tuna Rolls"))
             wishlist.pop();



    }
}
