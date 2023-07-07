class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int left =0; 
        int right =0;
        int count=0;
        int True = 0;
        while(right<answerKey.length()){
            if(answerKey.charAt(right)=='F'){
                count++;
            }
            while(count>k){
                if(answerKey.charAt(left)=='F'){
                    count--;
                }
                left++;
            }
            True = Math.max(True,(right-left)+1);
            right++;
        }
         left =0; 
         right =0;
         count=0;
        int False = 0;
        while(right<answerKey.length()){
            if(answerKey.charAt(right)=='T'){
                count++;
            }
            while(count>k){
                if(answerKey.charAt(left)=='T'){
                    count--;
                }
                left++;
            }
            False = Math.max(False,(right-left)+1);
            right++;
        }
        int ans = 0;
        ans = Math.max(True,False);
        return ans;
    }
}