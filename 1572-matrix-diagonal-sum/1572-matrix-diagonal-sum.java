class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        
        int k = mat.length/2;
        for(int i=0; i<mat.length ;i++){
            sum = sum + mat[i][i];
        }
        System.out.println(sum);
         int i=0;
         int j=mat.length-1;
        
          if(mat.length%2==0){
             while(i<mat.length){
                 sum = sum+ mat[i][j];
                 i++;
                 j--;
             } 
          }
        else{
             while(i<mat.length){
                 if(i!=k && j!=k){
                     sum = sum+ mat[i][j];
                     
                 }
                    i++;
                    j--;
             } 
        }
       
           
        
        return sum;
    }
}