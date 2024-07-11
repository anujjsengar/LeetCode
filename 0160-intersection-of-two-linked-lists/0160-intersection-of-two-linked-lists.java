/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        ArrayList<ListNode> list=new ArrayList<>();
        while(temp1!=null){
            list.add(temp1);
            temp1=temp1.next;
        }
        while(temp2!=null){
            if(list.contains(temp2)){
                return temp2;
            }
            temp2=temp2.next;
        }
        return null;
    }
}