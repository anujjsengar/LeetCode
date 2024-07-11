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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        String ans="";
        while(temp!=null){
            ans=ans+""+temp.val;
            temp=temp.next;
        }
        return check(ans);
    }
    public boolean check(String ans){
        int start=0;
        int stop=ans.length()-1;
        while(start<=stop){
            if(ans.charAt(start)!=ans.charAt(stop)){
                return false;
            }
            start++;
            stop--;
        }
        return true;
    }
}