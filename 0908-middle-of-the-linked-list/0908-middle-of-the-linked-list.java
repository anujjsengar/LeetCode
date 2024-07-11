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
    public ListNode middleNode(ListNode head) {
        ArrayList <ListNode> li=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            li.add(temp);
            temp=temp.next;
            //n++;
        }
        int n=li.size();
        //n=n%2==0?n/2+1:(n+1)/2;
        return li.get(n/2);
    }
}