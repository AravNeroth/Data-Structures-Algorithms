/*
name: Arav Neroth
class: CS 3 3rd Period
date:
 */

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class PostFix {
	private Stack<Double> stack;
	private String expression;

	public PostFix() {
	}

	public PostFix(String exp) {
		expression = exp;
		stack = new Stack<>();
		setExpression(exp);
	}

	public void setExpression(String exp) {
		expression = exp;
	}

	public double calc(double one, double two, char op) {
		double result = 0.0;
		// we use a switch case using the 'op' given to do the arithmetic
		switch (op) {

			// add
			case '+':
				result = one + two;
				break;

			// subtract
			case '-':
				result = one - two;
				break;

			// multiply
			case '*':
				result = one * two;
				break;

			// divide
			case '/':
				result = one / two;
				break;
		}
		return result;
	}

	// check to find operators
	private boolean isOperator(char c) {
		return c == '+' || c == '-' || c == '*' || c == '/';
	}

	public void solve() {
		for (char c : expression.toCharArray()) {
			if (Character.isDigit(c)) {
				stack.push((double) (c - '0'));

			} else if (isOperator(c)) {
				double val2 = stack.peek();
				stack.pop();
				double val1 = stack.peek();
				stack.pop();

				// ended up doing one first peek then pop
				// and got messed up numbers
				double result = calc(val1, val2, c);
				stack.push(result);
			}
		}
		// keep doing it until
		if (stack.size() == 1) {
			System.out.println(expression + " = " + stack.peek());
			stack.pop();

		}
		//add a toString
	}
}