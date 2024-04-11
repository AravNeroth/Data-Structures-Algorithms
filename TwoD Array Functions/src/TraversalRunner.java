/*
name: arav neroth
class: CS 3 3rd Period
date: 1/14/24
 */

public class TraversalRunner {
    public static void main(String[] args) {

        int[][] arr1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};


        BoundaryTraversal boundary = new BoundaryTraversal();
        SnakeTraversal snake = new SnakeTraversal();
        TransposeTraversal transpose = new TransposeTraversal();



        // boundary traversal
        System.out.println("----------------");
        System.out.println("Boundary Traversal");

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++)
                System.out.print(arr1[i][j] + "  ");

            System.out.println();
        }
        System.out.println();
        System.out.println(boundary.traverse(arr1));
        System.out.println("----------------");




        // snake traversal
        System.out.println("Snake Traversal");

        // initial array
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++)
                System.out.print(arr1[i][j] + "  ");

            System.out.println();
        }
        System.out.println();

        // snake array
        int[][] snaked = snake.traverse(arr1);

        for (int i = 0; i < snaked.length; i++) {
            for (int j = 0; j < snaked[i].length; j++)
                System.out.print(snaked[i][j] + "  ");

            System.out.println();
        }

        System.out.println("----------------");




        // transpose traversal
        System.out.println("Transpose Traversal");

        // initial array
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++)
                System.out.print(arr1[i][j] + "  ");

            System.out.println();
        }
        System.out.println();

        // transpose array
        int[][] transposed = transpose.traverse(arr1);

        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++)
                System.out.print(transposed[i][j] + "  ");

            System.out.println();
        }

        System.out.println("----------------");

    }
}
