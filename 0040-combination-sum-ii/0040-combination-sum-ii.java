class Solution {
    public void fun(int i, int sum,int t,List<Integer> ds, List<List<Integer>> ans,int[] c)
    {
        //base condition 
        if(sum==t)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(i==c.length)
        {
            return;
        }
        if(sum<t)
        {
            //pick
            ds.add(c[i]);
            fun(i+1,sum+c[i],t,ds,ans,c);
            //backtrack
            ds.remove(ds.size()-1);
            //skip 
            while(i<c.length-1&&c[i]==c[i+1]) i++;
            //do  not pick
            fun(i+1,sum,t,ds,ans,c);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        int sum=0;
        Arrays.sort(candidates);
        fun(0,sum,target,ds,ans,candidates);
        return ans;
    }
}