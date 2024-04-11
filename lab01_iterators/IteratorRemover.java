/*
Arav Neroth
CS 3 Period 3
8/24/23
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemover
{
	private ArrayList<String> list;
	private String toRemove;

	public IteratorRemover(String line, String rem)
	{
		String[] temp = line.split(" ");
		list = new ArrayList<>(Arrays.asList(temp));
		toRemove = rem;
	}

	public void setTest(String line, String rem)
	{
		String[] temp = line.split(" ");
		list = new ArrayList<>(Arrays.asList(temp));
		toRemove = rem;
	}

	public void remove()
	{
		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {

			if (iterator.next().equals(toRemove)) {
				iterator.remove();
			}
		}
	}

	public String toString()
	{
		return list.toString();
	}
}