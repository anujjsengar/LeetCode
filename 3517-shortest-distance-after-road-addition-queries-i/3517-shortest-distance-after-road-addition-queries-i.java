import java.util.*;

class Solution {
    HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();

    class Node {
        int id;
        int distance;

        Node(int id, int distance) {
            this.id = id;
            this.distance = distance;
        }
    }

    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        for (int i = 0; i < n; i++) {
            graph.putIfAbsent(i, new HashSet<>());
            if (i < n - 1) {
                graph.get(i).add(i + 1);
            }
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            graph.get(queries[i][0]).add(queries[i][1]);
            result[i] = bfs(0, n - 1);
        }
        return result;
    }

    private int bfs(int start, int target) {
        if (start == target) return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(start, 0));
        HashSet<Integer> visited = new HashSet<>();
        visited.add(start);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            for (int neighbor : graph.get(current.id)) {
                if (neighbor == target) return current.distance + 1;
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(new Node(neighbor, current.distance + 1));
                }
            }
        }
        return -1;
    }
}
