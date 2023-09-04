/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        if(head==null) return false;
        f = f.next;
        while(f!=null && f.next!=null ){
            if(f==s){
                return true;
            }
          s = s.next;
          f = f.next.next;
        }
        return false;
    }
}