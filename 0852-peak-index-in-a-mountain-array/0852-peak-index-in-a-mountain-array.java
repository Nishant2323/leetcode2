class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int m= (s+e)/2;
            if(arr[m]<arr[m-1])
            {
                e=m;
            }
            else if(arr[m]<arr[m+1])
            {
                s=m;
            }
            else
            {
                return m;
            }
        }
        return -1;
    }
}