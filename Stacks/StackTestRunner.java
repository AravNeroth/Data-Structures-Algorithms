/*
Name: Arav Neroth
Class: 3rd Period CS 3
Date: 10.25.23
 */


import java.util.Stack;

public class StackTestRunner
{
	public static void main ( String[] args ){
		StackTest tester = new StackTest("a b c d e f g h i");
		System.out.println(tester);
		tester.popEmAll();

		tester = new StackTest("1 2 3 4 5 6 7 8 9 10");
		System.out.println(tester);
		tester.popEmAll();

		tester = new StackTest("# $ % ^ * ( ) ) _");
		System.out.println(tester);
		tester.popEmAll();
	}
}