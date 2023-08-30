class Solution {
    public long minimumReplacement(int[] nums) {
        int n  = nums.length;
        int last = nums[n-1];
        long ans = 0;
        for(int i = n-2; i>=0;i--){
            if(nums[i]>last){
                int p = nums[i]/last;
                if(nums[i]%last!=0){
                    p++;
                }
                ans = ans+(p-1);
                last= nums[i]/p;
            }
            else{
                last = nums[i];
            }
        }
        return ans;
    }
}