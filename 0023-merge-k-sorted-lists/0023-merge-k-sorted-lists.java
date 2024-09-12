import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // PriorityQueue to hold the nodes with the smallest value at the top
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        
        // Add the head of each list to the priority queue
        for (ListNode list : lists) {
            if (list != null) {
                pq.add(list);
            }
        }
        
        // Create a dummy head for the resulting merged list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        // Process nodes from the priority queue
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            current.next = node;
            current = current.next;
            
            // If there is a next node, add it to the priority queue
            if (node.next != null) {
                pq.add(node.next);
            }
        }
        
        return dummy.next; // Return the merged list, skipping the dummy head
    }
}
