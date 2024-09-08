/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int extra=0;
        int each=1;
        if(size<=k){
            each=1;
            extra=0;
        }
        else{
            each=size/k;
            extra=size%k;
        }
        System.out.println(each);
        System.out.println(extra);
        ListNode[] list=new ListNode[k];
        ListNode node=head;
        ListNode prev=null;
        int index=0;
        while(size>0){
            list[index]=node;
            int x=0;
            while(x<each){
                prev=node;
                node=node.next;
                x++;
                size--;
            }
            if(extra>0){
                prev=node;
                node=node.next;
                extra--;
                size--;
            }
            index++;
            prev.next=null;
        }
        return list;
    }
}