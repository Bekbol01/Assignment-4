import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vertex<String> vertexA = new Vertex<>("A");
        Vertex<String> vertexB = new Vertex<>("B");
        Vertex<String> vertexC = new Vertex<>("C");

        Edge<String> graph = new Edge<>();
        graph.addVertex(vertexA);
        graph.addVertex(vertexB);
        graph.addVertex(vertexC);

        graph.addEdge(vertexA, vertexB, 5.0);
        graph.addEdge(vertexA, vertexC, 3.0);
        graph.addEdge(vertexB, vertexC, 2.0);

        Search<String> searchAlgorithm = new BreadthFirstSearch<>();
        List<Vertex<String>> path = searchAlgorithm.search(vertexA, vertexC);
        System.out.println("Path from A to C using BFS: " + path);
    }
}
