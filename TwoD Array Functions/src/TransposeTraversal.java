/*
name: arav neroth
class: CS 3 3rd Period
date: 1/14/24
 */

public class TransposeTraversal {
    public int[][] traverse(int[][] arr1) {
        int[][] sumArray = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[0].length; j++) {
                // flip flop
                sumArray[i][j] = arr1[j][i];
            }
        }

        return sumArray;
    }
}