class Solution {
    public int findKthLargest(int[] nums, int k) {
         int ans= 0;
      PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums){
            q.offer(i);
        }
        System.out.println(q);
        while(k>0){
            ans = q.remove();
            k--;
        }
        return ans;
    }
}