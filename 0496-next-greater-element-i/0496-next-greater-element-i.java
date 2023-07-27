class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer> hm = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for(int i = nums2.length-1;i>=0;i--){
            while(!s.empty()&& nums2[i]>=s.peek()){
                s.pop();
            }
            if(s.empty()){
                hm.put(nums2[i],-1);
            }
            else{
                hm.put(nums2[i],s.peek());
            }
            s.push(nums2[i]);
        }
        System.out.println(hm);
        int[] arr = new int[nums1.length];
        int p = 0;
        for(int i : nums1){
              arr[p++] = hm.get(i);
        }
        return arr;
    }
}