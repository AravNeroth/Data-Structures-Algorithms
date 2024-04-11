//� A+ Computer Science  -  www.apluscompsci.com
//Name - Arav Neroth
//Date - 9/11/23
//Class - CS 3 3rd period
//Lab  - look at the file name

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class MergeSort {
	private static int passCount;

	public static void mergeSort(Comparable[] list) {
		passCount = 0;
		mergeSort(list, 0, list.length);
	}

	private static void mergeSort(Comparable[] list, int front, int back) {
		if (back - front <= 1) {
			return;
		}

		int mid = (front + back) / 2;

		// sorting left
		mergeSort(list, front, mid);
		// sorting right (ew recusion but idk how else)
		mergeSort(list, mid, back);


		merge(list, front, mid, back);
	}

	private static void merge(Comparable[] list, int front, int mid, int back) {
		Comparable[] temp = new Comparable[back - front];
		int f = front;
		int m = mid;

		int k = 0;

		while (f < mid && m < back) {
			if (list[f].compareTo(list[m]) < 0) {
				temp[k++] = list[f++];
			} else {
				temp[k++] = list[f++];
			}
		}

		while (f < mid) {
			temp[k++] = list[f++];
		}

		while (f < back) {
			temp[k++] = list[f++];
		}

		for (k = 0; k < temp.length; k++) {
			list[front + k] = temp[k];
		}

		System.out.println("pass " + passCount + " " + Arrays.toString(list));

		passCount++;

	}
}












