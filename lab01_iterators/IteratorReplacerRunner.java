/*
Arav Neroth
CS 3 Period 3
8/24/23
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorReplacerRunner
{
	public static void main ( String[] args )
	{
		IteratorReplacer test1 = new IteratorReplacer("a b c a b c a", "a", "+");
		test1.replace();
		System.out.println(test1);

		IteratorReplacer test2 = new IteratorReplacer("a b c d e f g h i j x x x x", "x", "7");
		test2.replace();
		System.out.println(test2);

		IteratorReplacer test3 = new IteratorReplacer("1 2 3 4 5 6 a b c a b c", "b", "#");
		test3.replace();
		System.out.println(test3);
	}
}