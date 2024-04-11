/*
name: Arav Neroth
class: CS 3 3rd Period
date:
 */

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxCheckRunner
{
	public static void main ( String[] args )
	{
		SyntaxChecker sc = new SyntaxChecker("(abc(*def)");

		out.println(sc);

		sc = new SyntaxChecker("[{}]");
		System.out.println(sc);

		sc = new SyntaxChecker("[");
		System.out.println(sc);

		sc = new SyntaxChecker("[{<()>}]");
		System.out.println(sc);

		sc = new SyntaxChecker("{<html[value=4]*(12)>{$x}}");
		System.out.println(sc);

		sc = new SyntaxChecker("[one]<two>{three}(four)");
		System.out.println(sc);

		sc = new SyntaxChecker("car(cdr(a)(b)))");
		System.out.println(sc);

		sc = new SyntaxChecker("car(cdr(a)(b))");
		System.out.println(sc);	}
}