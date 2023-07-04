class Solution {
    public void rotate(int[][] matrix) {
        //tarspones 
        for(int i = 0 ;i<matrix.length;i++){
            for(int j =i ;j<matrix.length;j++){
                int temp  = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0;i<matrix.length;i++){
            int l=0;
            int h =matrix[i].length-1;
            while(l<h){
               int t=  matrix[i][l];
                matrix[i][l]=matrix[i][h];
                matrix[i][h]= t;
                l++;
                h--;
            }
        }
        
    }
    // public void display(int[][] a ){
    //     for(int i =0 ;i<a.length;i++){
    //         for(int j =0; j<a[i].length;j++){
    //             System.out.println(a[i][j]+" , ");
    //         }
    //         System.out.println();
    //     }
    // }
}