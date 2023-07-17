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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next==null) return head;
        ListNode curr = head;
        ListNode temp = head;
        int l = 0;
        while(temp.next!=null){
            l++;
            temp= temp.next;
            
        }
        l++;
        temp.next=head;
        k = k%l;
        int i =0;
        int j = l-k-1;
        while(i<j){
            curr = curr.next;
            i++;
        }
         head = curr.next ;
        curr.next = null;
        return head;
        
    }
}