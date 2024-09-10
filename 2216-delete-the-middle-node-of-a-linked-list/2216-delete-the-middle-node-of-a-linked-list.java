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
    public ListNode deleteMiddle(ListNode head) {
        ListNode t=head;
        int count=0;
        while(t!=null){
            t=t.next;
            count++;
        }
        int index=(count)/2-1;
        if(index==0){
            head.next=head.next.next;
            return head;
        }
        if(count==1){
            return null;
        }
        ListNode temp=head;
        while(index-->0){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}