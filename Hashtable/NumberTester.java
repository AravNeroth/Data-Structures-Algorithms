/*
name- Arav Neroth
date- 12/3/2023 (yes i know its late im sorry this took a while the logic was really getting to me)
class- CS 3 3rd Period
 */

public class NumberTester
{
	public static void main(String[] args)
	{
		Number one = new Number(45);
		System.out.println(one.hashCode());
		
		Number two = new Number(107);
		System.out.println(two.hashCode());
		
		Number three = new Number(213);
		System.out.println(three.hashCode());				
	}
}