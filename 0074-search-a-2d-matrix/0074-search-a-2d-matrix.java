class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row =0;
        for(int i =0 ;i<matrix.length;i++){
            if(matrix[i][matrix[i].length-1]>=target){
                row = i;
                break;
            }
        }
        System.out.println(row);
       int i = 0 ;
       int j = matrix[row].length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(matrix[row][mid]>target){
                j = mid -1;
            }
             else if(matrix[row][mid]<target){
                i = mid +1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}