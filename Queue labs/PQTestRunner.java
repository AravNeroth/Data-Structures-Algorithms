/*
name: Arav Neroth
date: 11.8.23
class: CS 3 3rd period
 */

public class PQTestRunner
{
	public static void main ( String[] args )
	{
		PQTester test1 = new PQTester("one two three four five six seven");
		System.out.println("toString() - " + test1.toString());
		System.out.println("getMin() - " + test1.getMin());
		System.out.println("getNaturalOrder() - " + test1.getNaturalOrder());
		System.out.println("\n");

		PQTester test2 = new PQTester("one two three four five 1 2 3 4 5");
		System.out.println("toString() - " + test2.toString());
		System.out.println("getMin() - " + test2.getMin());
		System.out.println("getNaturalOrder() - " + test2.getNaturalOrder());
		System.out.println("\n");

		PQTester test3 = new PQTester("a b c d e f g h i j k l m n o p");
		System.out.println("toString() - " + test3.toString());
		System.out.println("getMin() - " + test3.getMin());
		System.out.println("getNaturalOrder() - " + test3.getNaturalOrder());
	}
}