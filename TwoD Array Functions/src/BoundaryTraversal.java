/*
name: arav neroth
class: CS 3 3rd Period
date: 1/14/24
 */

import java.util.ArrayList;

public class BoundaryTraversal {

    public ArrayList<Integer> traverse(int[][] arr) {
        ArrayList<Integer> traversedArray = new ArrayList<Integer>();

        // top row
        for (int i = 0; i < arr.length; i++) {
            traversedArray.add(arr[0][i]);
        }

        // right side
        // iterate the col ignoring top row. col being iterated is the last col in the 2d array
        for (int m = 1; m < arr[0].length; m++) {
            traversedArray.add(arr[m][arr.length -1]);
        }

        // bottom row (like top, but backwards & accounting for repeats
        for (int i = arr.length - 2; i > -1; i--) {
            traversedArray.add(arr[arr.length - 1][i]);
        }

        // left side (adjusted vals on starting & ending points of the loop to not repeat
        for (int i = arr[0].length - 2; i > 0; i--) {
            traversedArray.add(arr[i][0]);
        }

        return traversedArray;
    }
}
