class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        long t = (long)target;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<nums.length;i++){
            
            int first = nums[i];
            for(int j = i+1 ;j<nums.length;j++){
                int second = nums[j];
                for(int k = j+1 ;k<nums.length;k++){
                    int th = nums[k];
                    int l = k+1;
                    int h = nums.length-1;
                    HashSet<Integer> hs = new HashSet<>();
                    while(l<=h){
                        int mid = (l+h)/2;
                        long sum = (long)first+second+th+nums[mid];
                        if(!hs.contains(nums[mid])){
                            if(sum>t){
                            h= mid-1;
                            }
                          else if(sum<t){
                            l=mid+1;
                            }
                          else{
                            List<Integer> a = new ArrayList<>();
                            a.add(first);
                            a.add(second);
                            a.add(th);
                            a.add(nums[mid]);
                            ans.add(a);
                          }
                          hs.add(nums[mid]);
                        }
                        else{
                           l++;  
                        }
                       
                    }
                    while(k+1<nums.length&&nums[k]==nums[k+1])k++;
                }
                 while(j+1<nums.length&&nums[j]==nums[j+1])j++;
            }
             while(i+1<nums.length&&nums[i]==nums[i+1])i++;
        }
        return ans;
    }
}