class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        for(int i = 0 ; i<matrix.length;i++){
            if(matrix[i][matrix[i].length-1]>target){
                row = i;
                break;
            }
            else if(matrix[i][matrix[i].length-1]==target){
                return true;
            }
        }
        for(int j = 0 ; j<matrix[0].length;j++){
            if(matrix[row][j]==target){
                return true;
            }
        }
        return false;
    }
}