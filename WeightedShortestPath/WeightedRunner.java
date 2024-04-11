/*
name: arav neroth
date: 1/30/24
class: CS 3 3rd period
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WeightedRunner {
    public static void main( String[] args ) throws IOException {

        Scanner file = new Scanner(new File("potholes.dat"));
        String line = "";

        while (file.hasNextLine()) {
            line += file.nextLine() + "\n";
        }
        WeightedPath wPath = new WeightedPath(line);

        System.out.println("Shortest Path from A to I: " + wPath.findShortestPath("A"));
        System.out.println("Shortest Path from A to G: " + wPath.findShortestPath("A"));

    }

}
