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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum =0;
        ListNode start= new ListNode();
        ListNode dp= start;
        int c =0;
        while(l1!=null || l2!=null){
            sum = c;
            if(l1!=null)sum = sum+ l1.val;
            if(l2!=null) sum = sum +l2.val;
            c= sum/10;
            int d = sum%10;
            ListNode t = new ListNode(d);
            dp.next = t;
            dp = t;
           if(l1!=null) l1 = l1.next;
           if(l2!=null) l2 = l2.next; 
            
        }
        if(c==1){
            ListNode t = new ListNode(c);
            dp.next = t;
            dp = t;
        }
        return start.next;
    }
}