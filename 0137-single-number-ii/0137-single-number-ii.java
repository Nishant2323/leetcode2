class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        HashMap<Integer,Integer>  hs = new HashMap<>();
        for(int i :nums){
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
        System.out.println(hs);
        for(int i : hs.keySet()){
            if(hs.get(i)==1){
                ans = i;
            }
        }
       return ans; 
    } 
}