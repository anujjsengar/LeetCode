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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;;
        int size=-1;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int bin=0;
        temp=head;
        while(temp!=null){
            if(temp.val==1){
                bin+=(int)Math.pow(2,size);
            }
            size--;
            temp=temp.next;
        }
        return bin;
        
    }
}