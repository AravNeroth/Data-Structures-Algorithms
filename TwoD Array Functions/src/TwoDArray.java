/*
name: arav neroth
class: CS 3 3rd Period
date: 1/9/24
 */

public class TwoDArray {

    // adding

    public int[][] addEm(int[][] arr1, int[][] arr2){
        int[][] sumArray = new int[2][2];

        // rows
        for(int i = 0; i < arr1.length; i++) {

            // columns
            for(int j = 0; j < arr1[0].length; j++) {

                // iterating through every place in 4x4 2d array,
                // and adding the values at the place in both
                // arrays into a new array
                sumArray[i][j] = arr1[i][j] + arr2[i][j];

            }
        }

        return sumArray;
    }

    // subtract

    public int[][] subtractEm(int[][] arr1, int[][] arr2){
        int[][] sumArray = new int[2][2];

        // rows
        for(int i = 0; i < arr1.length; i++) {

            // columns
            for(int p = 0; p < arr1[0].length; p++) {

                sumArray[i][p] = arr1[i][p] - arr2[i][p];

            }
        }

        return sumArray;
    }

    // dot multiply

    // arr1 col == to arr2 rows
    public int[][] multiplyEm(int[][] arr1, int[][] arr2){

        int[][] sumArray = new int[2][2];

        // through arr1 rows
        for(int g = 0; g < arr1.length; g++) {

            // through arr2 col
            for (int j = 0; j < arr2[0].length; j++) {

                // through arr1 col
                for (int k = 0; k < arr1[0].length; k++) {

                    // from the outer loops that go through the row of arr1 & col of arr2
                    // k loops through the places of cols in arr1
                    sumArray[g][j] += (arr1[g][k] * arr2[k][j]);
                }
            }
        }

        return sumArray;
    }
}
