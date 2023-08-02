class Solution {
    public List<Integer>ll(int[] n)
    {
        List<Integer> d= new ArrayList<>();
        for(int i=0;i<n.length;i++)
        {
            d.add(n[i]);
        }
        return d;
    }
    public void fun(int i,int[] n,List<List<Integer>> ans)
    {
        //base condition
        if(i==n.length)
        {
            ans.add(new ArrayList<>(ll(n)));
            return;
        }
        for(int ind= i;ind<n.length;ind++)
        {
            int temp=n[i];
            n[i]=n[ind];
            n[ind]=temp;
            fun(i+1,n,ans);
             temp=n[i];
            n[i]=n[ind];
            n[ind]=temp;
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        fun(0,nums,ans);
        return ans;
    }
}