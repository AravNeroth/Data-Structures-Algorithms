/*
Name: Arav Neroth
Class: CS3 2nd period
Date: 10/5/23
 */


import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets()
	{
		odds = new TreeSet<Integer>();
		evens = new TreeSet<Integer>();
	}

	public OddEvenSets(String line)
	{
		odds = new TreeSet<Integer>();
		evens = new TreeSet<Integer>();

		String [] str = line.split(" ");

		for(String s: str){
			int num = Integer.parseInt(s);

			if((num % 2 == 0)){
				evens.add(num);
			}else{
				odds.add(num);
			}
		}
	}

	public String toString()
	{
		return "ODDS : " + odds + "\n EVENS : " + evens + "\n\n";
	}
}