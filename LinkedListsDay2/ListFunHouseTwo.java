/*
name: Arav Neroth
date: 11.16.23
class: CS 3 3rd Period
 */


import static java.lang.System.*;

public class ListFunHouseTwo
{
	private ListNode theList;
	private ListNode head;

	public ListFunHouseTwo() {
		theList = new ListNode();
	}

	public void add(Comparable data) {
		if(head == null){
			head = new ListNode(data, theList);
			theList = new ListNode(head.getValue(), head);
		}
		else{
			ListNode toAdd = theList;
			while(toAdd.getNext() != head){
				toAdd = toAdd.getNext();
			}
			toAdd.setNext(new ListNode(data, head));

		}
	}
	
	//this method will return the number of nodes present in list
	public int nodeCount() {
		int count = 0;
		ListNode head = theList;

		while (head != null) {
			count++;
			head = head.getNext();
		}
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node at the front of the list.  Once finished, the first node will occur twice.
	public void doubleFirst()
	{
		ListNode list = theList;
		ListNode copy = new ListNode(list.getValue(), list.getNext());
		list.setNext(copy);
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public void doubleLast() {
		ListNode list = theList;
		ListNode prevList = null;

		while (list != null) {
			prevList = list;
			list = list.getNext();
		}

		prevList.setNext(new ListNode(prevList.getValue(), null));

	}


	//method skipEveryOther will remove every other node
	public void skipEveryOther(){
		ListNode temp = theList;

		// (this method threw me off for a hot minute)
		while((temp != null) && (temp.getNext() != null)){ // if two values left, skip the next value
			temp.setNext(temp.getNext().getNext());
			temp = temp.getNext();
		}
	}

	// this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value) {
		int count = 0;
		ListNode head = theList;

		while (head != null) {
			count++;

			if (count % x == 0)
				head.setValue(value);

			head = head.getNext();
		}
	}


	//this method will remove every xth node in the list
	public void removeXthNode(int x) {
		ListNode list = theList;
		int counter = 0;
		ListNode prevList = null;

		while (list != null) {
			counter++;
			if((counter % x) == 0)
				prevList.setNext(list.getNext());

			prevList = list;
			list = list.getNext();
		}
	}

	//this method will return a String containing the entire list
	public String toString() {
		String output = "";
		ListNode t = theList;

		while (t != null) {
			output += t.getValue() + " ";
			t = t.getNext();
		}
		//return System.out.println(out);
		return output;
	}


}