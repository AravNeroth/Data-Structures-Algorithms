/*
name: arav neroth
date: 12/28/24 (i got so fed up i restarted it completely)
class: 3rd period CS 3
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class ShortestPathGraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner file = new Scanner(new File("graph2.dat"));
		int howManyTimes = file.nextInt();
		file.nextLine();
		String desiredConnection = "";
		System.out.println("Graph Connections: \n");

		for (int x = 0; x < howManyTimes; x++) {

			String line = file.nextLine();
			ShortestPathGraph graph = new ShortestPathGraph(line);

			// store desired connection
			desiredConnection = file.nextLine();
			String start = desiredConnection.substring(0, 1);
			String end = desiredConnection.substring(1, 2);

			int shortestPath = graph.shortestPath(start, end);

			if (shortestPath != -1)
				System.out.println(start + " connects to  " + end + " == yes, in " + shortestPath + " steps");

			 else
				System.out.println(start + " connects to  " + end + " == no");

		}
	}
}