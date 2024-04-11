//� A+ Computer Science  -  www.apluscompsci.com
//Name - Arav Neroth
//Date - 9/11/23
//Class - CS 3 3rd period
//Lab  - look at the file name
// Mrs. roberts im not gonna lie i looked up how to do a lot of this
// in my defense it's a lot of nested code and i hate matrices

import java.util.*;
import java.io.*;

import java.util.Random;

public class MatrixSearch2 {
	private int[][] mat;

	public MatrixSearch2(int rows, int cols, int upper) {

		mat = new int[rows][cols];
		Random rand = new Random();

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				mat[i][j] = rand.nextInt(upper) + 1;
			}
		}
	}

	public int findMaxPrime() {

		int maxPrime = -1;
		int maxPrimeSum = 0;

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				if (isPrime(mat[i][j])) {

					int surroundingSum = getCountRndCell(i, j);

					if (surroundingSum > maxPrimeSum) {

						maxPrimeSum = surroundingSum;
						maxPrime = mat[i][j];
					}
				}
			}
		}

		return maxPrime;
	}

	public int getCountRndCell(int r, int c) {

		int cnt = 0;

		for (int i = r - 1; i <= r + 1; i++) {

			for (int j = c - 1; j <= c + 1; j++) {

				if (inBounds(i, j)) {
					cnt += mat[i][j];

				}
			}
		}

		return cnt;
	}

	private boolean inBounds(int r, int c) {
		return (r >= 0) && (r < mat.length) && (c >= 0) && (c < mat[0].length);
	}

	private boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public String toString() {
		String out = "";
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				out += String.format("%4d", mat[i][j]) + " ";
			}
			out += "\n";
		}
		return out;
	}
}

