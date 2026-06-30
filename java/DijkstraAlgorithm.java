import java.util.*;

public class DijkstraAlgorithm {

    // ANSI Escape Codes for Terminal Colors and Formatting
    private static final String RESET = "\u001B[0m";
    private static final String BOLD = "\u001B[1m";
    private static final String CYAN = "\u001B[36m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED = "\u001B[31m";
    private static final String WHITE_BACKGROUND = "\u001B[47m";
    private static final String BLACK_TEXT = "\u001B[30m";

    // Using Java Records for immutable, clean data carriers
    public record Edge(int target, int weight) {}

    public record Node(int vertex, int distance) implements Comparable<Node> {
        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    // A clean container wrapper to pass back results cleanly instead of relying on print statements
    public record Result(Map<Integer, Integer> distances, List<Integer> path, int totalCost) {}

    public static Result findShortestPath(Map<Integer, List<Edge>> graph, int start, int target) {
        // Collect all unique nodes safely, even if they have no outgoing edges
        Set<Integer> allNodes = new HashSet<>(graph.keySet());
        for (List<Edge> edges : graph.values()) {
            for (Edge e : edges) {
                allNodes.add(e.target);
            }
        }

        // Initialize distances safely
        Map<Integer, Integer> dist = new HashMap<>();
        for (int vertex : allNodes) {
            dist.put(vertex, Integer.MAX_VALUE);
        }
        dist.put(start, 0);

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        Set<Integer> visited = new HashSet<>();
        Map<Integer, Integer> previous = new HashMap<>();

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int u = current.vertex();
            int d = current.distance();

            if (u == target) break; // Found target early
            if (visited.contains(u)) continue;

            visited.add(u);

            List<Edge> edges = graph.getOrDefault(u, Collections.emptyList());
            for (Edge edge : edges) {
                int v = edge.target();
                int w = edge.weight();

                // Edge Case Avoidance: Ensure we don't calculate path if current node is unreachable
                if (dist.get(u) == Integer.MAX_VALUE) continue;

                int newDist = d + w;
                if (newDist < dist.get(v)) {
                    dist.put(v, newDist);
                    previous.put(v, u);
                    pq.add(new Node(v, newDist));
                }
            }
        }

        return new Result(dist, reconstructPath(previous, start, target, dist), dist.getOrDefault(target, Integer.MAX_VALUE));
    }

    private static List<Integer> reconstructPath(Map<Integer, Integer> previous, int start, int target, Map<Integer, Integer> dist) {
        List<Integer> path = new ArrayList<>();
        if (dist.getOrDefault(target, Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            return path; // Return empty list if target is completely unreachable
        }

        int current = target;
        while (current != start && previous.containsKey(current)) {
            path.add(current);
            current = previous.get(current);
        }
        path.add(start);
        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {
        Map<Integer, List<Edge>> graph = new HashMap<>();
        for (int i = 0; i < 8; i++) {
            graph.put(i, new ArrayList<>());
        }

        // Vertices mapping: A=0, B=1, C=2, D=3, E=4, F=5, G=6, H=7
        graph.get(0).addAll(List.of(new Edge(1, 3), new Edge(2, 12), new Edge(3, 4)));
        graph.get(1).addAll(List.of(new Edge(0, 3), new Edge(2, 2), new Edge(4, 6)));
        graph.get(2).addAll(List.of(new Edge(0, 12), new Edge(1, 2), new Edge(5, 8)));
        graph.get(3).addAll(List.of(new Edge(0, 4), new Edge(6, 2)));
        graph.get(4).addAll(List.of(new Edge(1, 6), new Edge(7, 5)));
        graph.get(5).addAll(List.of(new Edge(2, 8), new Edge(6, 1), new Edge(7, 2)));
        graph.get(6).addAll(List.of(new Edge(3, 2), new Edge(5, 1), new Edge(7, 10)));
        graph.get(7).addAll(List.of(new Edge(4, 5), new Edge(5, 2), new Edge(6, 10)));

        int startNode = 0;
        int targetNode = 7;

        // Execute algorithm
        Result result = findShortestPath(graph, startNode, targetNode);

        // Map numeric node IDs back to characters (0->A, 1->B, etc.) for beautiful output
        char startChar = (char) ('A' + startNode);
        char targetChar = (char) ('A' + targetNode);

        // Convert the path list to a styled string (e.g., A ➔ B ➔ C)
        String pathString;
        if (result.path().isEmpty()) {
            pathString = RED + "No Path Available" + RESET;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < result.path().size(); i++) {
                sb.append(GREEN).append((char) ('A' + result.path().get(i))).append(RESET);
                if (i < result.path().size() - 1) {
                    sb.append(CYAN).append(" ➔ ").append(RESET);
                }
            }
            pathString = sb.toString();
        }

        String costString = (result.totalCost() == Integer.MAX_VALUE) 
                ? RED + "UNREACHABLE" + RESET 
                : GREEN + BOLD + result.totalCost() + RESET;

        // --- Styled Console Interface Output ---
        System.out.println("\n" + WHITE_BACKGROUND + BLACK_TEXT + BOLD + "  DIJKSTRA'S SHORTEST PATH ROUTER  " + RESET);
        System.out.println(CYAN + "=============================================" + RESET);
        System.out.printf("%s%-20s%s %c\n", YELLOW, "• Origin Node:", RESET, startChar);
        System.out.printf("%s%-20s%s %c\n", YELLOW, "• Target Node:", RESET, targetChar);
        System.out.println(CYAN + "---------------------------------------------" + RESET);
        System.out.printf("%s%-20s%s %s\n", YELLOW, "• Shortest Path:", RESET, pathString);
        System.out.printf("%s%-20s%s %s\n", YELLOW, "• Total Path Cost:", RESET, costString);
        System.out.println(CYAN + "=============================================\n" + RESET);
    }
}
