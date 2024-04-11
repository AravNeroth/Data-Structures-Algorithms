/*
name: Arav Neroth
class: CS 3 3rd Period
date:
 */

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
	private String exp;
	private Stack<Character> symbols;

	public SyntaxChecker()
	{
		exp = "";
		symbols = new Stack<>();
	}

	public SyntaxChecker(String s)
	{
		exp = s;
		symbols = new Stack<>();
	}
	
	public void setExpression(String s)
	{
		exp = s;
	}

	public boolean checkExpression()
	{
		/*
		while there are more values in the expression
{
get a value from the input
if you have an opening symbol
push it on the stack
else if it is a close symbol
if the stack is not empty
pop a value
check for a match with the current close symbol
else
stop the process and mark the expression as bad
}
make sure nothing is left in the stack
		 */

		for (int i = 0; i < exp.length(); i++){
			char current = exp.charAt(i);

			if (current == '(' || current == '[' || current == '{') {

				// Push opening syntax onto Symbols
				symbols.push(current);

			} else if (current == ')' || current == ']' || current == '}') {

				// we get an error if the string is empty! so we check
				if (symbols.isEmpty()) {
					return false;
				}

				char popped = symbols.peek();
				symbols.pop();
				// if the current symbol is an ending syntax, and the currently popped
				if ((current == ')' && popped != '(' ) || (current == ']' && popped != '[' ) || (current == '}' && popped != '{' )) {
					return false;
				}
			}
		}

		// this sees if the Symbols stack is empty
		return symbols.isEmpty();
	}

	//write a toString

	public String toString(){

		// didnt want a super long return statement so i made 2
		// diff formatted outputs

		String output;
		if (checkExpression())
			output = " is correct.";
		else
			output = " is incorrect.";

		return exp + output;
	}
}