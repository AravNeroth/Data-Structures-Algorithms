/*
name: Arav Neroth
date: 11.8.23
class: CS 3 3rd period
 */

import java.util.*;

public class PQTester
{
	private Queue<String> pQueue;

	public PQTester() {
		pQueue = new PriorityQueue<>();
	}

	public PQTester(String list) {
		setPQ(list);
	}

	public void setPQ(String list) {
		// I may have had to google how to do the Array.asList(.split)
		pQueue = new PriorityQueue<>(Arrays.asList(list.split(" ")));
	}

	public Object getMin() {
		return pQueue.peek();
	}

	public String getNaturalOrder() {
		// make a pass through queue using the priority queue
		// hold our natural order in this string
		String naturalOrder = "";

		Queue<String> tempQueue = new LinkedList<>(pQueue);

		// sort th
		while (!tempQueue.isEmpty()) {
			naturalOrder += tempQueue.poll() + " ";
		}
		return naturalOrder;
	}

	public String toString() {
		return pQueue.toString();
	}

}







		//write a toString method
