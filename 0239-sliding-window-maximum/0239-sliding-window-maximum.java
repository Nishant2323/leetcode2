class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int[] nex= new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!st.empty()&&nums[i]>=nums[st.peek()])
            {
                st.pop();
            }
            if(st.empty())
            {
                nex[i]=n;
            }
            else
            {
                nex[i]=st.peek();
            }
            st.push(i);
        }
        int j=0;
        int[] ans = new int[n-(k-1)];
        for(int i=0;i<=n-k;i++)
        {
            j=i;
            while(nex[j]<i+k)
            {
                j=nex[j];
            }
            ans[i]=nums[j];
        }
        return ans;
    }
}