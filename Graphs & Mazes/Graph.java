/*
name: Arav Neroth
class: CS 3 3rd Period
date: 1/16/24
 */

import java.util.ArrayList;
import java.util.List;

public class Graph
{
	//private TreeMap<String, String> map;
	// 2d arrayf > tree map
	private boolean[][] graph;

	public Graph(int graphSize){
		// new graph from the size of list of connections of current iteration
		graph = new boolean[graphSize][graphSize];
		}
	public void addEdge(int index1, int index2) {
		// setting the edge for the desired connection ( AB = BA )
		graph[index1][index2] = graph[index2][index1] = true;
	}

	public boolean areConnected(int index1, int index2) {
		//  this method calls the search algorithm with the first and end letters
		// from the current runner iteration, and adds the size of the current graph length
		return depthFirstSearch(index1, index2, new boolean[graph.length]);
	}

	public boolean depthFirstSearch(int current, int target, boolean[] visited) {

		// if we find it first
		if (current == target) {
			return true;
		}

		// update the visited[] after
		visited[current] = true;

		for (int i = 0; i < graph.length; i++) {
			// yay more recursion! (I had help from online)
			// if the current place we are is true, and we haven't been here, and if the current place is our target,
			// return true- else keep recursing until the end of the list
			if (graph[current][i] && !visited[i] && depthFirstSearch(i, target, visited)) {
				return true;
			}
		}

		/*
		THOUGHTS FOR SHORTEST PATH-
		add counter outside the loop- make static?
		change boolean to int to return counter?

		store & update counter value before the 'true' case and then send value to a set method?
		call a getCount() method from runner?

		 */

		return false;
	}
}