class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> h= new HashMap<>();
        int u=0;
        for(int i:nums)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i:h.keySet())
        {
           if(h.get(i)>1)
           {
               u=i;
           }
        }
        return u;
    }
}