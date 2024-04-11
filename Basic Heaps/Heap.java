/*
name: arav neroth
date: 12.11.23
class: CS 3 3rd Period
 */

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;

public class Heap
{
	private List<Integer> list;

	public Heap()
	{
		list = new ArrayList<Integer>();
	}

	public void add(int value)
	{
		list.add(value);
		swapUp(list.size()-1);
	}

   public void swapUp(int bot)
   {
        if(bot > 0){
			int newParent = (bot - 1 ) / 2;

			if(list.get(bot) > list.get(newParent)){
				swap(bot, newParent);
				swapUp(newParent);
			}
		}
	}

	public void remove( )
	{
		if (list.isEmpty())
			return;

		list.set(0,list.get(list.size() - 1));
		list.remove(list.size() - 1);
		swapDown(list.size());
	}

	public void swapDown(int top)
	{
		int left = top * 2  + 1;
		int right = top * 2 + 2;
		int tipTop = top;

		if(list.size() - 1 >= top){

			if(left < list.size() && list.get(left) > list.get(tipTop)){
				tipTop = left;
			}

			if(right < list.size() && list.get(right) > list.get(tipTop)){
				tipTop = right;
			}

			if(tipTop != top){
				swap(top, tipTop);
				// yay recursion (this caused many errors)
				swapDown(tipTop);
			}

		}
	}
	
	private void swap(int start, int finish)
	{
        int tempStart = list.get(start);
        list.set(start, list.get(finish));
        list.set(finish, tempStart);
	}

	// i admit defeat mrs roberts
	// i mean it kind of works?
	public void print()
	{
		out.println("\n\nPRINTING THE HEAP!\n\n");
		printHeap(0, "");
		out.println();
	}

	private void printHeap(int rootIndex, String indent)
	{
		if (rootIndex < list.size())
		{
			int leftChildIndex = 2 * rootIndex + 1;
			int rightChildIndex = 2 * rootIndex + 2;

			printHeap(rightChildIndex, indent + "    ");

			out.print(indent);
			out.printf("%4d%n", list.get(rootIndex)); // Adjust spacing as needed

			printHeap(leftChildIndex, indent + "    ");
		}
	}



	public String toString()
	{
		return list.toString();
	}
}