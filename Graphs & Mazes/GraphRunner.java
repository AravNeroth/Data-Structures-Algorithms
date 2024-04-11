/*
name: Arav Neroth
class: CS 3 3rd Period
date: 1/16/24
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class GraphRunner {
	public static void main(String[] args) throws IOException {

		Scanner file = new Scanner(new File("graph1.dat"));
		int howManyTimes = file.nextInt();
		file.nextLine();
		String connections = "";
		String desiredConnection = "";
		System.out.println("Graph Connections:");

		for (int x = 0; x < howManyTimes; x++) {

			if (!file.hasNextLine()) {
				break;
			}
			// new graph per iteration & storing the connections and then getting the length
			connections = file.nextLine();
			int graphSize = connections.length();

			Graph letterGraph = new Graph(graphSize);

			for (int i = 0; i < graphSize - 1; i++) {

				int index1 = connections.charAt(i) - 'A';

				// was getting an out of bounds for index 2 so this doesnt crash it
				if (i + 1 < graphSize) {
					int index2 = connections.charAt(i + 1) - 'A';

					// conditional makes sure we don't go out of bounds and break the system when we look at the edge
					if ((index1 >= 0 && index1 < graphSize) && ((index2 >= 0 && index2 < graphSize))) {
						letterGraph.addEdge(index1, index2);
					}
				}
			}

			// read the desired connection & store the letters separately
			desiredConnection = file.nextLine();
			// store the start and target letters in char
			char startLetter = desiredConnection.charAt(0);
			char targetLetter = desiredConnection.charAt(1);

			// does connect happen
			if (letterGraph.areConnected(startLetter - 'A', targetLetter - 'A')) {

				System.out.println(startLetter + " is connected to " + targetLetter);
			} else {
				System.out.println(startLetter + " is not connected to " + targetLetter);
			}

		}
	}
}