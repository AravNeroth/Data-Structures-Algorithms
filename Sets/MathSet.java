/*
Name: Arav Neroth
Class: CS3 2nd period
Date: 10/5/23
 */


import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
		one = new TreeSet<Integer>();
		two = new TreeSet<Integer>();
	}

	public MathSet(String o, String t)
	{
		one = new TreeSet<Integer>();
		two = new TreeSet<Integer>();

		String[] coolStr = o.split(" ");

		for (String s : coolStr) {
			one.add(Integer.parseInt(s));
		}

		coolStr= t.split(" ");

		for (String s : coolStr) {
			two.add(Integer.parseInt(s));
		}
	}


	public Set<Integer> union()
	{
		Set<Integer> coolStr = new TreeSet<Integer>();

		coolStr.addAll(one);
		coolStr.addAll(two);

		return coolStr;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> coolStr = new TreeSet<Integer>();
		coolStr.addAll(one);

		Set<Integer> uncoolStr = new TreeSet<Integer>();
		uncoolStr.addAll(two);

		coolStr.retainAll(uncoolStr);

		return coolStr;
	}


	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> coolStr = new TreeSet<Integer>();
		coolStr.addAll(one);

		Set<Integer> uncoolStr = new TreeSet<Integer>();
		uncoolStr.addAll(two);

		coolStr.removeAll(uncoolStr);
		return coolStr;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> coolStr = new TreeSet<Integer>();
		coolStr.addAll(one);

		Set<Integer> uncoolStr = new TreeSet<Integer>();
		uncoolStr.addAll(two);

		uncoolStr.removeAll(coolStr);

		return uncoolStr;
	}


	public Set<Integer> symmetricDifference()
	{
		Set<Integer> coolStr = differenceAMinusB();

		coolStr.addAll(differenceBMinusA());
		return coolStr;
	}

	public String toString()
	{
		return "Set one " + one + "\n" +    "Set two " + two +  "\n";
	}
}