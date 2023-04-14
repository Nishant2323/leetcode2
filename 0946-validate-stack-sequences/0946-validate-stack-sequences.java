class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0;
        int j = 0;
        Stack<Integer> ans = new Stack<>();
        while(i<pushed.length || j< popped.length){
            if(i == pushed.length){
                int temp = ans.peek();
                if(temp != popped[j]){
                    return false;
                }
                else{
                    ans.pop();
                    j++;
                }
            }
            else{
                if(pushed[i]==popped[j]){
                ans.push(pushed[i]);
                ans.pop();
                i++;
                j++;
            }
            else if(!ans.empty()&& ans.peek() == popped[j]){
               
                ans.pop();
                j++;
            }    
            else{
                ans.push(pushed[i]);
                i++;
            }
            }
            
        }
        return true;
    }
}