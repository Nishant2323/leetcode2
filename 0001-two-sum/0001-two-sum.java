class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i= 0 ;i<nums.length;i++){
            int first = nums[i];
            for(int j = i+1 ; j<nums.length;j++){
                int second = nums[j];
                if((second +first)==target){
                    ans[0] =i;
                    ans [1] =j;
                    break;
                }
            }
        }
        return ans;
    }
}