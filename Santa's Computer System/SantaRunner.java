/*
name: Arav Neroth
date: 12.15.23 - 12.21.23
class: Computer Science 3 | 3rd Period
Semester 1 Project
 */

import java.util.*;

public class SantaRunner {

    static Map<String, String> deliveryMap = new LinkedHashMap<>();

    public static void main(String[] args) {

        ArrayList<SantaComputer> childList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        childList.add(new SantaComputer("(0) Larry (age 11)", "2001 BMW Drive"));
        childList.add(new SantaComputer("(1) Tarry (age 4)", "2002 Miata Street"));
        childList.add(new SantaComputer("(2) Harry (age 15)", "2003 Lexus Avenue"));
        childList.add(new SantaComputer("(3) Parry (age 12)", "3001 Mercedes Bend"));
        childList.add(new SantaComputer("(4) Sarry (age 17)", "3002 Porsche Street"));
        childList.add(new SantaComputer("(5) Warry (age 8)", "3003 Acura Lane"));
        childList.add(new SantaComputer("(6) Carry (age 6)", "4001 Toyota Bend"));
        childList.add(new SantaComputer("(7) Qarry (age 9)", "4002 Honda Avenue"));
        childList.add(new SantaComputer("(8) Varry (age 3)", "4003 Audi Lane"));
        childList.add(new SantaComputer("(9) Jarry (age 10)", "5000 McLaren Drive"));

        boolean exitRequested = false;

        while (!exitRequested) {

            System.out.println("Santa's Workshop | v1.08*  Blitzen Edition |");
            System.out.println("Please select a number, then hit 'Enter'\n");
            System.out.println("1: Print All Monitored Children.");
            System.out.println("2: Record A Good Deed.");
            System.out.println("3: Record a Naughty Deed.");
            System.out.println("4: Update All Childrens' Statuses.");
            System.out.println("5: Generate The Christmas Route.");
            System.out.println("6: Exit the System.");

            System.out.print("Enter a Number: \n");
            int choice = scanner.nextInt();
            // Process user choice
            switch (choice) {
                case 1:
                    System.out.println("Printing all monitored children... \n");
                    monitoredChildren(childList);
                    break;
                case 2:
                    System.out.println("Follow The Prompts to Record a Good Deed");
                    recordGoodDeed(childList, scanner);
                    break;
                case 3:
                    System.out.println("Follow The Prompts to Record a Naughty Deed");
                    recordNaughtyDeed(childList, scanner);
                    break;
                case 4:
                    System.out.println("Updating All Children's Statuses...");
                    System.out.println("... ... ... ... ... ...");
                    System.out.println("Status For All Children Updated.");
                    updateChildrenStatus(childList);
                    break;
                case 5:
                    System.out.println("Accounting For Snowstorms...");
                    System.out.println("Theorizing Weight...");
                    System.out.println("Adjusting For Air Resistance...");
                    System.out.println("Calculating Nicest to Naughtiest Children Route...");
                    System.out.println("Christmas Route Completed. \n");
                    calculateRoute(childList);
                    break;
                case 6:
                    System.out.println("Have a Merry Christmas. Powering off.");
                    exitRequested = true;
                    break;

                default:
                    System.out.println("Unrecognized Entry. Please select a number between 1 and 6.");
            }
        }
    }

    public static void monitoredChildren(ArrayList<SantaComputer> childList) {
        for (SantaComputer child : childList) {
            System.out.println("Name: " + child.getName());
            System.out.println("Nice Level: " + child.getChildScore());
            System.out.println("Address: " + child.getAddress());
            System.out.println();
        }
    }

    public static void recordGoodDeed(ArrayList<SantaComputer> childList, Scanner scanner) {
        for (SantaComputer child : childList) {
            System.out.println(child.getName());
        }
        System.out.print("Enter The Number Of The Child You Wish To Record A Nice Deed For: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        if (index >= 0 && index < childList.size()) {
            SantaComputer child = childList.get(index);

            System.out.println("Child Chosen: " + child.getName());
            System.out.print("Please Enter The Good Deed: ");
            String gDeed = scanner.nextLine();
            child.addActivity(gDeed, true);

            System.out.println("Nice List");
            for (SantaComputer children : childList) {
                System.out.print(children.getName() + " - ");
                System.out.print(children.getNiceDeeds() + "\n");
            }
            System.out.println("\n");

            System.out.println("Naughty List");
            for (SantaComputer children : childList) {
                System.out.print(children.getName() + " - ");
                System.out.print(children.getNaughtyDeeds() + "\n");
            }

            System.out.println("\n");

            System.out.println("Successfully Recorded Good Deed '" + gDeed + "' for " + child.getName());
            // Add code to record a good deed for the specified child
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }

    public static void recordNaughtyDeed(ArrayList<SantaComputer> childList, Scanner scanner) {
        for (SantaComputer child : childList) {
            System.out.println(child.getName());
        }
        System.out.print("Enter The Number Of The Child You Wish To Record A Naughty Deed For: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        if (index >= 0 && index < childList.size()) {
            SantaComputer child = childList.get(index);

            System.out.println("Child Chosen: " + child.getName());
            System.out.print("Please Enter The Naughty Deed: ");
            String bDeed = scanner.nextLine();

            child.addActivity(bDeed, false);

            System.out.println("Nice List");
            for (SantaComputer children : childList) {
                System.out.print(children.getName() + " - ");
                System.out.print(children.getNiceDeeds() + "\n");
            }
            System.out.println("\n");

            System.out.println("Naughty List");
            for (SantaComputer children : childList) {
                System.out.print(children.getName() + " - ");
                System.out.print(children.getNaughtyDeeds() + "\n");
            }

            System.out.println("\n");


            System.out.println("Successfully Recorded Naughty Deed '" + bDeed + "' for " + child.getName());
            // Add code to record a good deed for the specified child
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }

    public static void updateChildrenStatus(ArrayList<SantaComputer> childList) {
        System.out.println("Adding Presents / Coal Based On Childrens' Weekly Behaviour... \n");
        System.out.println("List of Presents");
        for (SantaComputer child : childList) {
            child.weeklyWishlistUpdate();
            System.out.println(child.getName() + " - ");
            System.out.print(child.getWishlist() + "\n");
        }

        System.out.print("Successfully Updated Statuses \n.");
    }

    public static void calculateRoute(ArrayList<SantaComputer> childList) {
        List<SantaComputer> sorted = new ArrayList<>(childList);

        // yeah I some parts of the statement below online after I couldn't get my priority queue to work
        // and I learned that :: can be used to get the reference of a method in a class!

        Collections.sort(sorted, Comparator.comparingInt(SantaComputer::getChildScore).reversed());

        // put this all into our Delivery Map, and pair it with the address
        for (SantaComputer child : sorted) {
            System.out.println(child.getName() + ": " + child.getChildScore());
            deliveryMap.put(child.getName(), child.getAddress());
        }

        System.out.println("\n" + deliveryMap.toString() + "\n");

    }

}