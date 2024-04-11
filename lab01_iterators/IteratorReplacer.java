/*
Arav Neroth
CS 3 Period 3
8/24/23
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacer
{
	private ArrayList<String> list;
	private String toRemove, replaceWith;

	public IteratorReplacer(String line, String rem, String rep)
	{
		String[] temp = line.split(" ");
		list = new ArrayList<>(Arrays.asList(temp));
		toRemove = rem;
		replaceWith = rep;
	}

	public void setEmAll(String line, String rem, String rep)
	{
		String[] temp = line.split(" ");
		list = new ArrayList<>(Arrays.asList(temp));
		toRemove = rem;
		replaceWith = rep;
	}

	public void replace()
	{
		ListIterator<String> iterator = list.listIterator();

		while (iterator.hasNext()) {

			if (iterator.next().equals(toRemove)) {
				iterator.remove();
				iterator.add(replaceWith);
			}

		}
	}

	public String toString()
	{
		return list.toString()+"\n\n";
	}
}