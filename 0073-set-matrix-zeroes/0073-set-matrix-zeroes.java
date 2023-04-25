class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0; i< matrix.length;i++){
            for(int j =0; j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                  List<Integer> a = new ArrayList<>();
                    a.add(i);
                    a.add(j);
                    ans.add(a);
                }
            }
        }
        for(int i=0;i<ans.size();i++){
           helper(ans.get(i),matrix);
        }
    }
    public void helper(List<Integer> l , int[][]m){
        int s = l.get(0);
        int j = l.get(1);
        for(int i=0;i<m[s].length;i++){
            m[s][i]=0;
        }
         for(int i=0;i<m.length;i++){
            m[i][j]=0;
        }
    }
    
}