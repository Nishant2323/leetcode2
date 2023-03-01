class Solution {
    public int[] sortArray(int[] nums) {
        int[] ans= new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i : nums){
            pq.add(i);
        }
      for(int i=0;i<nums.length;i++){
          ans[i]= pq.remove();
      }
       return ans; 
    }
}