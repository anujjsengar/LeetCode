class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }
        HashSet<Integer> visited = new HashSet<>();
        int cable = 0;
        int component = 0;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] conn : connections) {
            graph.get(conn[0]).add(conn[1]);
            graph.get(conn[1]).add(conn[0]);
        }
        for (int i = 0; i < n; i++) {
            if (visited.contains(i)) {
                continue;
            }
            component++;
            Queue<Integer> q = new LinkedList<>();
            q.add(i);

            while (!q.isEmpty()) {
                int curr = q.poll();
                if (visited.contains(curr)) {
                    continue;
                }
                visited.add(curr);

                for (int neighbor : graph.get(curr)) {
                    if (!visited.contains(neighbor)) {
                        q.add(neighbor);
                    }
                }
            }
        }
        return component - 1;
    }
}
