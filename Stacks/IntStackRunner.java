/*
Name: Arav Neroth
Class: 3rd Period CS 3
Date: 10.25.23
 */
//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import static java.lang.System.*;

public class IntStackRunner
{
	public static void main ( String[] args )
	{
		IntStack test = new IntStack();
		test.push(5);
		test.push(7);
		test.push(9);
		System.out.println(test);
		System.out.println(test.isEmpty());
		System.out.println(test.pop());
		System.out.println(test.peek());
		System.out.println(test.pop());
		System.out.println(test.pop());
		System.out.println(test.isEmpty());
		System.out.println(test);

		//expand the test cases to test the class more thoroughly

	}
}