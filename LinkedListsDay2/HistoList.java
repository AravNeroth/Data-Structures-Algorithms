/*
name: Arav Neroth
date: 11.16.23
class: CS 3 3rd Period
 */

import java.util.*;
import static java.lang.System.*;

public class HistoList
{
   private HistoNode front;

	public HistoList( )
	{
		front = null;
	}

	//addLetter will add a new node to the front for let if let does not exist
	//addLetter will bump up the count if let already exists

	// not my favoite method to keep track of stuff in
	public void addLetter(char let)
	{
		if (front == null) {
			front = new HistoNode(let, 1, null);

		} else {
			HistoNode current = front;

			while (current != null) {
				// this was not fun to keep track of
				if (current.getLetter() == let) {
					current.setLetterCount(current.getLetterCount() + 1);
					return;
				}

				current = current.getNext();
			}
			front = new HistoNode(let, 1, front);
		}
	}

	//returns the index pos of let in the list if let exists
	public int indexOf(char let)
	{
		HistoNode current = front;
		int index = 0;

		// while not empty
		while (current != null) {

			// check if the current letter is == let
			if (current.getLetter() == let) {
				return index;
			}
			// set current to get next, move the index up, and repeat until we find it
			current = current.getNext();
			index++;
		}

		return -1;
	}

	//returns a reference to the node at spot
	// (finally a nice, simple, easy to read method)
	private HistoNode nodeAt(int spot)
	{
		HistoNode current = front;

		// if i is less than the spot we want, and we don't go out of bounds, loop
		for (int i = 0; i < spot && current != null; i++) {
			current = current.getNext();
		}
		return current;
	}

	public String toString()
	{
		String output = "";
		HistoNode current = front;

		while (current != null) {
			output += current.getLetter() + " - " + current.getLetterCount() + " ";
			current = current.getNext();
		}

		return output;
	}
}