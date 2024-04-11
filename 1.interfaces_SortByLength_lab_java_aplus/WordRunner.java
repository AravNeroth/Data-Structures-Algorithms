/*
Arav Neroth
3rd Period CS 3
8/30/23
 */

import java.io.File; 
import java.io.IOException;
import java.util.*;

import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		file.nextLine();

		ArrayList<String> dataUnsorted = new ArrayList<String>();

		for (int i = 0; i < size; i++) {
			dataUnsorted.add(file.nextLine());
		}

		String[] dataArray = dataUnsorted.toArray(new String[0]);


		Arrays.sort(dataArray, new Comparator<String>() {
			public int compare(String word1, String word2) {
				return new Word(word1).compareTo(new Word(word2));
			}
		});

		ArrayList<String> dataSorted = new ArrayList<>(Arrays.asList(dataArray));

		for (String word : dataSorted)
			System.out.println(word);
	}
}





