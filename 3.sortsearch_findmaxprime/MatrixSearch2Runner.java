//� A+ Computer Science  -  www.apluscompsci.com
//Name - Arav Neroth
//Date - 9/11/23
//Class - CS 3 3rd period
//Lab  - look at the file name
import java.util.*;
import java.io.*;

public class MatrixSearch2Runner {
    public static void main(String[] args) {

        MatrixSearch2 matrix1 = new MatrixSearch2(20, 15, 50);
        System.out.println(matrix1);
        int maxPrime = matrix1.findMaxPrime();
        System.out.println("\nMax Prime = " + maxPrime);

        MatrixSearch2 matrix2 = new MatrixSearch2(15, 15, 75);
        System.out.println(matrix2);
        int maxPrime2 = matrix2.findMaxPrime();
        System.out.println("\nMax Prime = " + maxPrime2);

        MatrixSearch2 matrix3 = new MatrixSearch2(7, 7, 100);
        System.out.println(matrix3);
        int maxPrime3 = matrix3.findMaxPrime();
        System.out.println("\nMax Prime = " + maxPrime3);



    }
}
