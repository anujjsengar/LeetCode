import java.util.*;

class Solution {
    public class Node implements Comparable<Node> {
        int city;
        int cost;
        int stops;

        public Node(int city, int cost, int stops) {
            this.city = city;
            this.cost = cost;
            this.stops = stops;
        }

        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        HashMap<Integer, HashMap<Integer, Integer>> graph = new HashMap<>();
        for (int[] flight : flights) {
            graph.putIfAbsent(flight[0], new HashMap<>());
            graph.get(flight[0]).put(flight[1], flight[2]);
        }

        int[][] dist = new int[n][k + 2];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dist[src][0] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(src, 0, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();

            if (current.city == dst) {
                return current.cost;
            }

            if (current.stops > k) {
                continue;
            }

            if (graph.containsKey(current.city)) {
                for (Map.Entry<Integer, Integer> neighbor : graph.get(current.city).entrySet()) {
                    int nextCity = neighbor.getKey();
                    int newCost = current.cost + neighbor.getValue();

                    if (newCost < dist[nextCity][current.stops + 1]) {
                        dist[nextCity][current.stops + 1] = newCost;
                        pq.add(new Node(nextCity, newCost, current.stops + 1));
                    }
                }
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i <= k + 1; i++) {
            result = Math.min(result, dist[dst][i]);
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
