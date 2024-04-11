/*
Name: Arav Neroth
Class: CS 3 3rd Period
Date: 10/10/23
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class RelativesRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scan = new Scanner(new File("relatives.dat"));
		Relatives relate = new Relatives();

		while(scan.hasNextLine())
			relate.setPersonRelative(scan.nextLine());

		out.println(relate);
	}
}