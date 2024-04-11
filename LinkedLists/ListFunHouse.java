/*
Name: Arav Neroth
Class: CS 3 3rd Period
Date: 11.12.23
 */

import static java.lang.System.*;

public class ListFunHouse
{
	//this method will print the entire list on the screen
   public static void print(ListNode list)
   {
	   while (list != null)
	   {
		   System.out.print(list.getValue() + " ");
		   list = list.getNext();
	   }
   }		
	
	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
   	int count=0;
		while (list != null) {
			count++;
			list = list.getNext();
		}
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list) {
		if (list != null){
				Comparable value = list.getValue();
				ListNode newNode = new ListNode(value, list.getNext());
				list.setNext(newNode);

	}

	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list)
	{
		if (list != null) {
			ListNode current = list;
			Comparable value = 0;

			while (current.getNext() != null)
				current = current.getNext();

			value = current.getValue();

			ListNode newNode = new ListNode(value, null);

			current.setNext(newNode);
		}
	}
		
	//method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list)
	{
		int count = 0;
		ListNode current = list;
		ListNode previous = null;

		while (current != null)
		{
			if (count % 2 != 0)
			{
				// Skip every other node
				previous.setNext(current.getNext());
				current.setNext(null);
				current = previous.getNext();
			} else {
				previous = current;
				current = current.getNext();
			}

			count++;
		}
	}

	//this method will set the value of every xth node in the list

	// I got a little help from online for this one- my for() loop kept breaking
	public static void setXthNode(ListNode list, int x, Comparable value)
	{
		ListNode current = list;

		if (x <= 0 || list == null)
			// returns original list since it's null
			return;

		for (int i = 1; (i < x) && (current != null) ; i++){
			current = current.getNext();
		}

		if (current != null) {
			current.setValue(value);
		}
	}

	//this method will remove every xth node in the list

	// I got a lot of help from online for this one- my for() loop kept breaking
	public static void removeXthNode(ListNode list, int x) {
		if (x <= 0 || list == null)
			return;

		if (x == 1) {
			// we take away the first node
			ListNode newHead = list.getNext();
			list.setNext(null);

		} else{
				ListNode current = list;
				ListNode previous = null;

				for (int i = 1; i < x && current != null; i++) {
					previous = current;
					current = current.getNext();
				}

				if (current != null) {
					// Remove the xth node
					previous.setNext(current.getNext());
					current.setNext(null);
				}
			 }
		}
	}
