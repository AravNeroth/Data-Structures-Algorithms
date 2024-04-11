/*
name: Arav Neroth
date: 12.13.23
class: CS 3 3rd Period
 */

public class HeapSortRunner
{
	public static void main ( String[] args )
	{
		HeapSort heap = new HeapSort();

		int[] nums = {99,2,8,75,10,7,9,17,5,3,4,1,11,1};
		
		heap.heapSort(nums);
		
		System.out.println(heap);
	}
}