/*
Name: Arav Neroth
Class: 3rd Period CS 3
Date: 10.25.23
 */
//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.*;

public class IntStack
{
	//pick your storage for the stack
	//you can use the an array or an ArrayList

	//option 1
	//private int[] rayOfInts;
	private int numInts;

	//option 2
	private ArrayList<Integer> listOfInts;

	public IntStack()
	{
		listOfInts = new ArrayList<>();
		numInts = 0;
	}

	public void push(int item)
	{
		numInts++;
		listOfInts.add(item);
	}

	public int pop()
	{
		if(!isEmpty()) {
			numInts--;
			listOfInts.remove(listOfInts.size() - 1);
			return numInts;
		}
		else
			return -1;
	}

	public boolean isEmpty()
	{
		return listOfInts.isEmpty();
	}

	public int peek()
	{
		// this may have given me an out of bounds error
		// because i forgot that it starts at 0
		return listOfInts.get(listOfInts.size() - 1);
	}

	public String toString()
	{
		return listOfInts.toString();
	}
}