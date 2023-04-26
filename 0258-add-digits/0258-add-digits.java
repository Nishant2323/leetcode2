class Solution {
    public int addDigits(int num) {
        int dig =num;
        int temp= num;
       while(size(dig)>1){
           dig=0;
           while(temp>0){
               int d = temp%10;
               temp=temp/10;
               dig = dig+d;
           }
           temp=dig;
       }
        return dig;
    }
    public int size(int num){
        int count=0;
        while(num>0){
            count++;
            num= num/10;
        }
        return count;
    }
}