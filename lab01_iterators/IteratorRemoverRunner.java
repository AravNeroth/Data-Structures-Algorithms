/*
Arav Neroth
CS 3 Period 3
8/24/23
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemoverRunner
{
	public static void main ( String[] args )
	{
		IteratorRemover test1 = new IteratorRemover("a b c a b c a", "a");
		test1.remove();
		System.out.println(test1);

		IteratorRemover test2 = new IteratorRemover("a b c d e f g h i j x x x x", "x");
		test2.remove();
		System.out.println(test2);

		IteratorRemover test3 = new IteratorRemover("1 2 3 4 5 6 a b c a b c", "b");
		test3.remove();
		System.out.println(test3);
	}
}