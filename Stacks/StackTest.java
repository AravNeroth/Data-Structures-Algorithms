/*
Name: Arav Neroth
Class: 3rd Period CS 3
Date: 10.25.23
 */

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.Stack;
import static java.lang.System.*;

public class StackTest
{
	private Stack<String> stack;

	public StackTest(String line){
		setStack(line);
	}

	public void setStack(String line){
		stack = new Stack<>();

		for(String temp : line.split(" "))
			stack.push(temp);
	}

	public void popEmAll(){
		out.println("poopping all items from the stack");

		while(!stack.isEmpty())
			System.out.print(stack.pop() + " ");

		System.out.print("\n" + "\n");
	}

	public String toString(){
		return stack.toString() + "\n";
	}

}