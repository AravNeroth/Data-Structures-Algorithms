/*
Name: Arav Neroth
Class: CS 3 3rd Period
Date: 10.22
 */
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import static java.lang.System.*;

public class NumberRunner
{
	public static void main ( String[] args ) throws IOException
	{
		String filename = "number.dat";
		ArrayList<Number> numbers = new ArrayList<>();
		Scanner scanner = new Scanner(new File(filename));

			while (scanner.hasNextLine()) {

				String line = scanner.nextLine();
				String[] parts = line.split(" ");

				String starting = parts[0];
				int base = Integer.parseInt(parts[1]);

				numbers.add(new Number(starting, base));
			}


		Collections.sort(numbers);

		for (Number num : numbers) {
			System.out.println(num.toString());
		}

	}
}