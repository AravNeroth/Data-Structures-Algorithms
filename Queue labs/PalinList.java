/*
name: Arav Neroth
date: 11.8.23
class: CS 3 3rd period
 */

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList {
	private Queue<String> queue;
	private Stack<String> stack;

	public PalinList() {
		queue = new LinkedList<String>();
		stack = new Stack<String>();
		setList("");
	}

	public PalinList(String list) {
		queue = new LinkedList<String>();
		stack = new Stack<String>();
		setList(list);
	}

	public void setList(String list) {
		String[] words = list.split(" ");

		for (String word : words) {
			queue.add(word);
			stack.push(word);
		}
	}

	public boolean isPalin() {
		Queue<String> reversedQueue = new LinkedList<>(queue);

		while (!stack.isEmpty()) {
			if (!stack.pop().equals(reversedQueue.poll())) {
				return false;
			}
		}
		return true;
	}



	public String toString(){
		String output;
		output = isPalin() ? " is a palinlist." : " is not a palinlist";


		return queue.toString() + output;
	}

}