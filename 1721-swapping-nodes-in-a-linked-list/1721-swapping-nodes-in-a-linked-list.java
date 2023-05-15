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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode i = first(head,k);
        ListNode j = last(head, k);
        int temp = i.val;
        i.val=j.val;
        j.val =temp;
        return head;
    }
    public ListNode first(ListNode head,int k){
        int i =1;
        ListNode temp = head;
        while(i!=k){
            temp= temp.next;
            i++;
        }
        return temp;
    }
    public ListNode last(ListNode head ,int k){
        ListNode p = head;
        ListNode q = head;
        int n = k;
        while(n>0){
            p=p.next;
            n--;
        }
        while(p!=null){
            p= p.next;
            q = q.next;
        }
        return q;
    }
}