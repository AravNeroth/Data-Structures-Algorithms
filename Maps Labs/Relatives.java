/*
Name: Arav Neroth
Class: CS 3 3rd Period
Date: 10/10/23
 */

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class Relatives
{
	private Map<String,Set<String>> map;

	public Relatives()
	{
		map = new TreeMap<>();

	}

	public void setPersonRelative(String line)
	{
		String[] personRelative = line.split(" ");

		if(personRelative.length == 2){

			if(map.get(personRelative[0]) == null)
				map.put(personRelative[0],new TreeSet<>());

			map.get(personRelative[0]).add(personRelative[1]);
		}
	}


	public String getRelatives(String person)
	{
		return map.get(person).toString();
	}


	public String toString()
	{
		String output = "";

		for(Map.Entry<String,Set<String>> entry : map.entrySet())

			output += entry.getKey() + " is related to " + entry.getValue().toString().replaceAll("[^\\w\\s]","" ) + "\n";

		return output;
	}
}