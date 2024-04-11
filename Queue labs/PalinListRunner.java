/*
name: Arav Neroth
date: 11.8.23
class: CS 3 3rd period
 */

public class PalinListRunner
{
	public static void main ( String[] args )
	{
		PalinList list1 = new PalinList("one two three two one");
		PalinList list2 = new PalinList("1 2 3 4 5 one two three four five");
		PalinList list3 = new PalinList("a b c d e f g x y z g f h");
		PalinList list4 = new PalinList("racecar is racecar");
		PalinList list5 = new PalinList("1 2 3 a b c c b a 3 2 1");
		PalinList list6 = new PalinList("chicken is a chicken");


		System.out.println(list1.toString());
		System.out.println(list2.toString());
		System.out.println(list3.toString());
		System.out.println(list4.toString());
		System.out.println(list5.toString());
		System.out.println(list6.toString());

	}
}