/*
name: Arav Neroth
date: 12.13.23
class: CS 3 3rd Period
 */

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;

public class HeapSort
{
	private List<Integer> list;

	public HeapSort()
	{
		list = new ArrayList<Integer>();
	}

   public void swapUp(int index)
   {

	}

	public void swapDown(int index)
	{
 		 int bigChild = 0;
		 int root = 0;

		 while (index > root) {

			 if (index > root * 2 + 2) {
				 // if index is greater than one side

				 if (list.get(root * 2 + 1) > list.get(root * 2 + 2))
					 bigChild = root * 2 + 1;
					 // changing the val of the bigger child if the left side is greater than the right

				 else
					bigChild = root * 2 + 2;
				 	// changing the val of the bigger child if the right side is greater than the left
			 }

			 else if (index > root * 2 + 1){
				 bigChild = root * 2 + 1;

				 // this is the same as whats inside the if() loop ^ above, but in case the condition
				 // index > root * 2 + 2 is false, BUT root * 2 + 1 is true

				 // theres probably a better way to do this

			 }

			 if(list.get(root) < list.get(bigChild)){
				 // future referance-  MAY NOT WORK!
				 swap(root, bigChild);
				 root = bigChild;
			 }

		 }

	}

   public void heapSort(int[] nums)
   {

   }
   
   private void swap(int first, int last)
   {
	   int tempFirst = list.get(first);
	   list.set(first, last);
	   list.set(last, tempFirst);

  	}

	public String toString()
	{
		return list.toString();
	}
}