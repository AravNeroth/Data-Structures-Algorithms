import java.util.*;

/*
name: arav neroth
date: 1/30/24
class: CS 3 3rd period
 */
public class WeightedPath {
    private Map<String, HashMap<String, Integer>> graph;
    private String to, from;

    public WeightedPath(String line) {

        graph = new HashMap<>();
        String[] connections = line.split(" ");

        for (String connection : connections) {
            // store values
            to = connection.substring(0, 1);
            from = connection.substring(2, 3);
            String letterDist = connection.substring(4);
            int dist = Integer.parseInt(letterDist);
            // add the edges
            addEdges(from, to, dist);
            addEdges(to, from, dist);

        }
    }

    // add edges but with distance
    public void addEdges(String from, String to, Integer dist) {

        if (!graph.containsKey(from))
            graph.put(from, new HashMap<>());

        graph.get(from).put(to, dist);
    }

    public List<String> findShortestPath(String starting) {
        Map<String, Integer> distance = new HashMap<>();
        Map<String, String> previous = new HashMap<>();

     //   List<String> visited = new ArrayList<>();
        List<String> unvisited = new ArrayList<>();
        List<String> path = new ArrayList<>();

        for (String vertex : graph.keySet()) {

            // setup by sorting the graph by putting all the letters equal to 'starting'
            // at the front, and everything else at the end of the map, then add to 'unvisited'
            if (vertex.equals(starting))
                distance.put(vertex, 0);
             else
                distance.put(vertex, Integer.MAX_VALUE);


            unvisited.add(vertex);
        }

        // repeat until we visit everywhere
        while (!unvisited.isEmpty()) {


            int minDistance = Integer.MAX_VALUE;
            String minVertex = null;

            for (String b : unvisited) {
                if (distance.get(b) < minDistance) {
                    minVertex = b;
                    minDistance = distance.get(b);
                }
            }

            // we are visiting 'b' so take it out
            unvisited.remove(minVertex);

            for (String v : graph.get(minVertex).keySet()) {

                // store the value of the added distance
                int totalDist = distance.get(minVertex) + graph.get(minVertex).get(v);

                // compare totalDist to the value of v
                // and if its less, it's shorter - so it's the new path
                if (totalDist < distance.get(v)) {
                    distance.put(v, totalDist);
                    // store it for later
                    previous.put(v, minVertex);
                }
            }
        }

        // go backwards
        while (previous.get(from) != null) {
            path.add(0, from);
            from = previous.get(from);
        }
        path.add(0, starting);

        return path;
    }


}