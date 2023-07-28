import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create vertices
        Vertex<String> vertexA = new Vertex<>("A");
        Vertex<String> vertexB = new Vertex<>("B");
        Vertex<String> vertexC = new Vertex<>("C");

        // Create the weighted graph
        Edge<String> graph = new Edge<>();
        graph.addVertex(vertexA);
        graph.addVertex(vertexB);
        graph.addVertex(vertexC);

        // Add edges with weights
        graph.addEdge(vertexA, vertexB, 5.0);
        graph.addEdge(vertexA, vertexC, 3.0);
        graph.addEdge(vertexB, vertexC, 2.0);

        // Perform a search (e.g., using BFS)
        Search<String> searchAlgorithm = new BreadthFirstSearch<>();
        List<Vertex<String>> path = searchAlgorithm.search(vertexA, vertexC);
        System.out.println("Path from A to C using BFS: " + path);
    }
}
