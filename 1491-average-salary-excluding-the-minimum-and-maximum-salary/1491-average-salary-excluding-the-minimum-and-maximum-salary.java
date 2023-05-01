class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE; 
        int sum= 0;
        for(int i:salary){
            max=Math.max(max,i);
            min = Math.min(min,i);
        }
        for(int i =0 ; i<salary.length;i++){
            if(salary[i]==max||salary[i]==min){
                continue;
            }
            else{
                sum = sum+salary[i];
            }    
                
        }
       double ans = (double)sum/(salary.length-2);
        return ans;
    }
}