/*
Name: Arav Neroth
Class: CS3 2nd period
Date: 10/5/23
 */


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class OddRunner
{
	public static void main( String args[] ) throws IOException
	{

		Scanner input = new Scanner(new File ("oddevent.dat"));

		while (input.hasNext()){
			String inputNums = input.nextLine();
			OddEvenSets coolobj = new OddEvenSets(inputNums);

			System.out.println(coolobj);

		}

	}
}