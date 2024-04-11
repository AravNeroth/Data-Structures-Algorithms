/*
Name: Arav Neroth
Class: CS3 2nd period
Date: 10/5/23
 */


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File ("mathsetdata.dat"));
		MathSet tester = new MathSet();

			while(input.hasNextLine()) {

				String one = input.nextLine();
				String two = input.nextLine();

				tester = new MathSet(one, two);

				System.out.println(tester);
				System.out.println("union - " + tester.union());
				System.out.println("intersection - " + tester.intersection());
				System.out.println("difference A-B - " + tester.differenceAMinusB());
				System.out.println("difference B-A - " + tester.differenceBMinusA());
				System.out.println("symmetric difference - " + tester.symmetricDifference());
				System.out.println("\n");


			}
	}
}
