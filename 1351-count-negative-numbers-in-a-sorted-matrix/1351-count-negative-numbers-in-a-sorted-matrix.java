class Solution {
    public int countNegatives(int[][] grid) {
        int ans =0;
        for(int i=0 ;i< grid.length; i++){
            ans = ans + count(grid[i]);
        }
        return ans;
    }
    public int count(int[] a){
        int count=0;
        for(int i =a.length-1;i>=0;i--){
            if(a[i]<0){
                count++;
            }
        }
        return count;
    }
}