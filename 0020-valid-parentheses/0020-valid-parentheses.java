class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('){
                s1.push(c);
            }
            else if(c=='{'){
                s1.push(c);
            }
            else if(c=='['){
                s1.push(c);
            }
            else if(  c==')'){
                if(s1.empty()){
                     return false;
                 }
                char temp = s1.pop();
                
                if(temp!='('){
                    return false;
                }
            }
             else if(c=='}'){
                 if(s1.empty()){
                     return false;
                 }
                char temp = s1.pop();
                 
                if(temp!='{'){
                    return false;
                }
            }
             else if(c==']'){
                 if(s1.empty()){
                     return false;
                 }
                char temp = s1.pop();
                 
                if(temp!='['){
                    return false;
                }
            }
            
        }
        
        return s1.empty();
    }
}