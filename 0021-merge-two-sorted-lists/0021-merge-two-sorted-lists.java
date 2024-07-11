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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list2==null){
            return list1;
        }
        if(list1==null){
            return list2;
        }
        if(list1.val<list2.val){
            ListNode x=list1.next;
            list1.next=list2;
            list2=list1;
            list1=x;
        }
        ListNode l1=list1;
        while(l1!=null){
            ListNode hold=l1.next;
            ListNode l2=list2;
            while(l2!=null){
                if(l2.next==null && l1.val>=l2.val){
                    l2.next=l1;
                    l1.next=null;
                    break;
                }
                if(l1.val>=l2.val && l1.val<=l2.next.val){
                    ListNode next=l2.next;
                    l2.next=l1;
                    l1.next=next;
                    break;
                }
                else{
                    l2=l2.next;
                }
            }
            l1=hold;
        }
        return list2;
    }
}