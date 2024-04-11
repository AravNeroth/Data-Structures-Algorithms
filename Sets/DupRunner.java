/*
Name: Arav Neroth
Class: CS3 2nd period
Date: 10/5/23
 */


import static java.lang.System.*;
import java.util.*;

public class DupRunner {
	public static void main(String args[]) {

		UniquesDupes perhapsDupe = new UniquesDupes();

		System.out.println("Original List: " + "a b c d e f g h a b c d e f g h i j k");
		System.out.println("Uniques: " + perhapsDupe.getUniques("a b c d e f g h a b c d e f g h i j k"));
		System.out.println("Dupes: " + perhapsDupe.getDupes("a b c d e f g h a b c d e f g h i j k"));

		System.out.println("Original List: " + "one two three one two three six seven one two");
		System.out.println("Uniques: " + perhapsDupe.getUniques("one two three one two three six seven one two"));
		System.out.println("Dupes: " + perhapsDupe.getDupes("one two three one two three six seven one two"));

		System.out.println("Original List: " + "1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6");
		System.out.println("Uniques: " + perhapsDupe.getUniques("1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6"));
		System.out.println("Dupes: " + perhapsDupe.getDupes("1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6"));

	}
}