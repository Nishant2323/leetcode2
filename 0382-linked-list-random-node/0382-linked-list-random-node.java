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
      public ListNode head1;
    public Solution(ListNode head) {
        head1=head;
    }
    
    public int getRandom() {
        ListNode temp = head1;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        Random random = new Random();   
      // Generates random integers 0 to 49  
        int x = random.nextInt(size); 
        temp= head1;
        int i=0;
        while(i<x){
            temp=temp.next;
            i++;
        }
        return temp.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */