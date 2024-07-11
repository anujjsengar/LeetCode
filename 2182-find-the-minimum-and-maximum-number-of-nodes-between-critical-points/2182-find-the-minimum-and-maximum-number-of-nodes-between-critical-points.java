/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1, -1};
        if (head == null || head.next == null || head.next.next == null) return ans;

        ListNode pre = head;
        ListNode cur = head.next;
        int prePosition = -1, curPosition = -1, firstPosition = -1, position = 1;

        while (cur.next != null) {
            ListNode next = cur.next;
            if ((cur.val < pre.val && cur.val < next.val) || (cur.val > pre.val && cur.val > next.val)) {
                prePosition = curPosition;
                curPosition = position;
                if (firstPosition == -1) {
                    firstPosition = position;
                }
                if (prePosition != -1) {
                    if (ans[0] == -1) {
                        ans[0] = curPosition - prePosition;
                    } else {
                        ans[0] = Math.min(ans[0], curPosition - prePosition);
                    }
                    ans[1] = position - firstPosition;
                }
            }
            pre = cur;
            cur = next;
            position++;
        }
        return ans;
    }
}