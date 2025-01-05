/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {

        // if we dont have head then we copy the value of next node into current node and the address of next to next node to current node and this is how the next node gets deleted.
        node.val = node.next.val;
        node.next = node.next.next;
    }
}