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
    public ListNode insertionSortList(ListNode head) {
       ArrayList<Integer> li=new ArrayList<>();
       ListNode temp=head;
       while(temp!=null){
        li.add(temp.val);
        temp=temp.next;
       }
       Collections.sort(li);
       ListNode tempr=head;
       int i=0;
       while(tempr!=null){
        tempr.val=li.get(i);
        i++;
        tempr=tempr.next;
       }
       return head;
    }
}