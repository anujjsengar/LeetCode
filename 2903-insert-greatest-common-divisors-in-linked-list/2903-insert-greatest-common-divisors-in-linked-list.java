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
            temp.next=new ListNode(gcd(temp.val,tt.val));
            temp.next.next=tt;
            temp=tt;
        }
        return head;
    }
    public int gcd(int a,int b){
        if(a==1 || b==1){
            return 1;
        }
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}