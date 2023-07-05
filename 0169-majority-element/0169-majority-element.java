class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length/2;
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        System.out.println(hm);
        for(int i : hm.keySet()){
            if(hm.get(i)>n){
                ans=i;
                break;
            }
        }
        return ans;
    }
}