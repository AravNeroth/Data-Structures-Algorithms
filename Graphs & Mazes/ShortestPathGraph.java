/*
name: arav neroth
date: 12/28/24 (i got so fed up i restarted it completely)
class: 3rd period CS 3
 */

import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.System.*;

public class ShortestPathGraph
{
	private Map<String, HashSet<String>> graph;
	private boolean found;
	private int shortest;
	public ShortestPathGraph(String line)
	{
		graph = new HashMap<>();
		String[] connections = line.split(" ");

		for (String connection : connections) {
			// store values
			String from = connection.substring(0, 1);
			String to = connection.substring(1, 2);

			// add the edges
			addEdges(from, to);
			addEdges(to, from);
		}
	}

	public void addEdges(String from, String to){

		if (!graph.containsKey(from))
			graph.put(from, new HashSet<>());

		graph.get(from).add(to);
	}

	public int shortestPath(String from, String to)
	{
		// feed in starting letter & ending letter + hashdset to store visited nodes
		return check(from, to, new HashSet<>(), 0);
	}

	public int check(String current, String end, HashSet<String> visited, int steps)
	{
		if (current.equals(end))
			return steps;

		// add our current location if it isn't the desired one
		visited.add(current);

		// if it has the key
		if (graph.containsKey(current)) {

			int minSteps = -1; // Initialize minSteps

			for (String neighbor : graph.get(current)) {

				// if whatever isn't visited contains neighbor, add a step & repeat
				if (!visited.contains(neighbor)) {

					// i got stuck for so long because I wasn't passing in a new HashSet, and was using visited raw...
					int result = check(neighbor, end, new HashSet<>(visited), steps + 1);

					if (result != -1) {
						// if the min steps is still -1, or result is larger than minSteps, minSteps = result
						if (minSteps == -1 || result < minSteps) {
							minSteps = result;
						}
					}
				}
			}

			return minSteps;
		}

		return -1;
	}

}