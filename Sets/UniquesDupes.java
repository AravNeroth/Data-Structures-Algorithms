/*
Name: Arav Neroth
Class: CS3 2nd period
Date: 10/5/23
 */

import java.util.Set;
import java.util.TreeSet;

public class UniquesDupes {

	public Set<String> getUniques(String input) {

		Set<String> uniques = new TreeSet<String>();
		String[] uniqueInput = input.split(" ");

		for (String s : uniqueInput)
			uniques.add(s);

		return uniques;
	}

	public Set<String> getDupes(String input) {

		Set<String> uniques = new TreeSet<String>();
		Set<String> dupes = new TreeSet<String>();
		String[] dupeInput = input.split(" ");

		for (String c : dupeInput) {
			if (uniques.add(c) == false)
				dupes.add(c);
		}

		return dupes;
	}
}