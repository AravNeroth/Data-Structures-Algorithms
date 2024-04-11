/*
Name: Arav Neroth
Class: CS 3 3rd Period
Date: 10.24.23
 */


import java.util.Scanner;
import static java.lang.System.*;

public class Convert
{
	private String sentence;
	private String binary;

	public Convert()
	{

	}

	public Convert(String sentence)
	{
		this.sentence = sentence;
	}

	public void convert()
	{
		binary = "";

		for (char character : sentence.toCharArray()) {

			int asciiValue = character;
			String binaryString = Integer.toString(asciiValue, 2);

			// each binray digit has 8
			while (binaryString.length() < 8) {

				// (this adding 0 gave me a hard time i had too look it up)
				// but now I know how it works- it fills in the blank spaces
				// with 0's so that there isnt any blank spaces and its always
				// 8 digits (ex. Binary 110001 becomes 00110001)
				binaryString = "0" + binaryString;
			}

			// adds the soace after 8 0's or 1's so that its readable
			binary += binaryString + " ";
		}
	}

	public String toString()
	{
		return sentence + "\n" + binary + "\n";
	}
}