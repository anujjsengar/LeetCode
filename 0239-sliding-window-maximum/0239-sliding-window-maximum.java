import java.util.PriorityQueue;

class Solution {
    public static class Node implements Comparable<Node> {
        int val;
        int idx;

        public Node(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Node b) {
            return b.val - this.val;
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        PriorityQueue<Node> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(new Node(nums[i], i));
        }

        res[0] = pq.peek().val;
        int index = 1;

        for (int i = k; i < nums.length; i++) {
            while (!pq.isEmpty() && pq.peek().idx <= i - k) {
                pq.poll();
            }

            pq.add(new Node(nums[i], i));
            res[index] = pq.peek().val;
            index++;
        }

        return res;
    }
}
