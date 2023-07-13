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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode temp = head;
        // int size=0;
        // while(temp!=null){
        //     size++;
        //     temp= temp.next;
        // }
        // if(size==1){
        //     return null;
        // }
        // int i =1 ;
        // ListNode s =head;
        // while(i<(size-n)){
        //     s= s.next;
        //     i++;
        // }
        // s.next = s.next.next;
        // System.out.println(size-n);
        // return head;
        ListNode start = new ListNode();
        start.next=head;
        ListNode p = start;
        ListNode q = start;
        int i =0;
        while(i<n){
            p = p.next;
            i++;
        }
        // System.out.println(p.val);
        while(p.next!=null){
            p = p.next;
            q = q.next;
        }
        // if(q.next==null){
        //     return null;
        // }
        q.next = q.next.next;
        return start.next;
        
    }
}