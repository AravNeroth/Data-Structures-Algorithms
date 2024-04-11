/*
name- Arav Neroth
date- 12/3/2023 (yes i know its late im sorry this took a while the logic was really getting to me)
class- CS 3 3rd Period
 */

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import static java.lang.System.*;

public class HashTableRunner
{
  public static void main ( String[] args )
  {
		try{
			//make a new table			
			HashTable into = new HashTable();

			//read from the file			
			Scanner scan = new Scanner(new File("numbers.dat"));
			scan.next();

			//load stuff into the table			
			while (scan.hasNextInt()) {
				into.add(new Number(scan.nextInt()));
			}

			System.out.println(into);

			// Print out the table
			System.out.println("Contents of the Hash Table:\n" + into);


		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem!");
		}
  }
}