/*
name: arav neroth
class: CS 3 3rd Period
date: 1/9/24
 */

public class TwoDRunner {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2},
                {3, 4}};


        int[][] arr2 = {
                {8, 6},
                {9, 7}};

        TwoDArray calc = new TwoDArray();

        int[][] added = calc.addEm(arr1, arr2);
        int[][] subtracted = calc.subtractEm(arr1, arr2);
        int[][] multiplied = calc.multiplyEm(arr1, arr2);


        // printing arr1 + arr2 ------------------------------------
        System.out.println("----------------");
        System.out.println("Addition");

        // printing arr1 + arr2
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++)
                System.out.print(arr1[i][j] + "  ");

            System.out.println();
        }

        System.out.println(" +");

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++)
                System.out.print(arr2[i][j] + "  ");

            System.out.println();
        }

        System.out.println(" =");
        // printing arr1 + arr2 ------------------------------------

        // printing addEmUp
        for (int i = 0; i < added.length; i++) {

            for (int j = 0; j < added[i].length; j++)
                System.out.print(added[i][j] + "  ");

            System.out.println();
        }


        // subtraction


        System.out.println("----------------");
        System.out.println("Subtraction");

        // printing arr1 + arr2 ------------------------------------
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++)
                System.out.print(arr1[i][j] + "  ");

            System.out.println();
        }

        System.out.println(" -");

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++)
                System.out.print(arr2[i][j] + "  ");

            System.out.println();
        }

        System.out.println(" =");
        // printing arr1 + arr2 ------------------------------------

        // printing subtractEm
        for (int i = 0; i < subtracted.length; i++) {

            for (int j = 0; j < subtracted[i].length; j++)
                System.out.print(subtracted[i][j] + "  ");

            System.out.println();
        }


        // multiplication


        System.out.println("----------------");
        System.out.println("Multiplication");

        // printing arr1 + arr2 ------------------------------------
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++)
                System.out.print(arr1[i][j] + "  ");

            System.out.println();
        }

        System.out.println(" *");

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++)
                System.out.print(arr2[i][j] + "  ");

            System.out.println();
        }

        System.out.println(" =");
        // printing arr1 + arr2 ------------------------------------


        // printing multiplyEm
        for (int i = 0; i < multiplied.length; i++) {

            for (int j = 0; j < multiplied[i].length; j++)
                System.out.print(multiplied[i][j] + "  ");

            System.out.println();
        }

    }


}