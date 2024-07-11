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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        ListNode place=head;
        ListNode prev=head;
        ListNode ultrprev=head;
        int sum=0;
        while(temp!=null){
            if(temp.val==0){
                place.val=sum;
                place=temp;
                ultrprev=prev;
                prev=temp;
                sum=0;
            }
            else{
                sum=sum+temp.val;
                prev.next=temp.next;
            }
            temp=temp.next;
        }
        ultrprev.next=null;
        return head;
    }
}