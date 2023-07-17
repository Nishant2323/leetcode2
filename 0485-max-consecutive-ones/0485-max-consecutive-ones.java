class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int count = 0;
        int max = 0;
        for(int i : nums){
            if(i == 1){
                count++;
            }
            else{
                max = Math.max(count, max);
                count = 0;
            }
            
        }
         max = Math.max(count, max);
        return max;
    }
}