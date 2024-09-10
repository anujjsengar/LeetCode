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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while(temp.next!=null){
            ListNode tt=temp.next;
            temp.next=new ListNode(common(temp.val,tt.val));
            temp.next.next=tt;
            temp=tt;
        }
        return head;
    }
    public int common(int a,int b){
        int div=a>b?b:a;
        while(div>0){
            if(a%div==0 && b%div==0){
                return div;
            }
            div--;
        }
        return 1;
    }
}