class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans= new ArrayList<>();
        int minc=0;
        int minr=0;
        int maxr=matrix.length-1;
        int maxc= matrix[0].length-1;
        int c=0;
        int t= matrix.length*matrix[0].length;
        int i=0;
        int j=0;
        while(c<t)
        {
            for(i=minr,j=minc;j<=maxc&&c<t;j++)
            {
                ans.add(matrix[i][j]);
                c++;
            }
            minr++;
            for(i=minr,j=maxc;i<=maxr&&c<t;i++)
            {
                ans.add(matrix[i][j]);
                c++;
            }
            maxc--;
            for(i=maxr,j=maxc;j>=minc&&c<t ;j--)
            {
                ans.add(matrix[i][j]);
                c++;
            }
            maxr--;
            for(i=maxr,j=minc;i>=minr&&c<t ;i--)
            {
                ans.add(matrix[i][j]);
                c++;
            }
            minc++;
            
        }
        return ans;
    }
}