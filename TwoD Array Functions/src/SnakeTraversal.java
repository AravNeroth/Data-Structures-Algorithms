/*
name: arav neroth
class: CS 3 3rd Period
date: 1/14/24
 */

public class SnakeTraversal {


    public int[][] traverse(int[][] arr1) {
        int[][] sumArray = new int[arr1.length][arr1[0].length];

        // iterates throughout matrix rows
            for (int i = 0; i < arr1.length; i++) {

                // left side (even)
                if (i % 2 == 0) {
                    for (int j = 0; j < arr1[0].length; j++)
                        sumArray[i][j] += arr1[i][j];
                }

                // right side (odd)
                else {
                    for (int j = arr1[0].length - 1; j >= 0; j--)
                        sumArray[i][arr1[0].length - 1 - j] = arr1[i][j];
                }
            }

        return sumArray;
    }
}