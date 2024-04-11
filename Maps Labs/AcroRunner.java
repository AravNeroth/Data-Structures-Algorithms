/*
Name: Arav Neroth
Class: CS 3 3rd Period
Date: 10/10/23
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class AcroRunner
{
	public static void main( String args[] ) throws IOException {
		Acronyms objAcro = new Acronyms();

		Scanner input = new Scanner(new File("acro.dat"));
		int count = input.nextInt();
		input.nextLine();

		for (int i = 0; i < count; i++)
			objAcro.putEntry(input.nextLine());

		System.out.println(objAcro);

		System.out.println("====\t READ CONTENTS \t==== \n");

		while (input.hasNextLine()) {
			System.out.println(objAcro.convert(input.nextLine()));
		}
	}
}