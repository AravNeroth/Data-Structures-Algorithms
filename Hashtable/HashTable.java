/*
name- Arav Neroth
date- 12/3/2023 (yes i know its late im sorry this took a while the logic was really getting to me)
class- CS 3 3rd Period
 */

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable
{
	private LinkedList[] table;

	public HashTable( )
	{
		table = new LinkedList[10];
	}

	public void add(Object obj)
	{
		System.out.println("add");
		int i = obj.hashCode();

		// i had a loop here that iterated throughout which repeated everything
			// if it's null
			if (table[i] == null) {
				table[i] = new LinkedList<>();
			}

			// Add object to bucket & ignore the "generfiy" suggestion from
			table[i].add(obj);

		}


	public String toString()
	{
		String output = "HASHTABLE\n";

		for (int k = 0; k < table.length; k++)
		{
			output += "bucket " + k + ":";

			if (table[k] != null)
			{
				for (Object f : table[k])
				{
					output += " " + ((Number)f).getValue();
				}
			}

			output += "\n";
		}
		return output;
	}
}