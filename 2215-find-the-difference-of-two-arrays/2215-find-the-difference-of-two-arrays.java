class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
         HashSet<Integer> h1 = new HashSet<>();
        for(int i: nums2){
            hs.add(i);
        }
        List<Integer> first = new ArrayList<>();
        for(int i: nums1){
        
            if(!hs.contains(i)&& !h1.contains(i)){
                first.add(i);
                h1.add(i);
            }
        }
        
        ans.add(first);
        hs.clear();
        h1.clear();
        for(int i: nums1){
            hs.add(i);
        }
        List<Integer> second = new ArrayList<>();
        for(int i: nums2){
        
            if(!hs.contains(i)&& !h1.contains(i)){
                second.add(i);
                h1.add(i);
            }
        }
        ans.add(second);
        return ans;
        
     }
}