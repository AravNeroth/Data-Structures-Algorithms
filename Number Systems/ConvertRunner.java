/*
Name: Arav Neroth
Class: CS 3 3rd Period
Date: 10.24.23
 */


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class ConvertRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("convert.dat"));

		while (file.hasNextLine()) {

			String input = file.nextLine();
			Convert converter = new Convert(input);

			converter.convert();

			System.out.println(converter);
		}




	}
}