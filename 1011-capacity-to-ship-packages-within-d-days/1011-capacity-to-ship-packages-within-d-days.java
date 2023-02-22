class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int min=0;
        for(int w:weights)
        {
            min=Math.max(w,min);
            max=max+w;
        }
        int retval=0;
        while(min<=max)
        {
            int m=(min+max)/2;
           int re=helper(weights,m);
            if(re>days)
            {
                min=m+1;
            }
            else
            {
                retval=m;
                max=m-1;
            }
                
        }
        return retval;
    }
    public int helper(int[] w,int d)
    {
        int curr=0;
        int da=1;
        for(int i:w)
        {
            curr=curr+i;
            if(curr>d)
            {
                da++;
                curr=i;
            }
        }
        return da;
    }
}