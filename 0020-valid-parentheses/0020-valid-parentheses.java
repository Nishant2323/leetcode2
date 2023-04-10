class Solution {
    public boolean isValid(String s) {
        Stack<Character> h=new Stack<>();
        for(char i:s.toCharArray())
        {
            if(i=='(')
            {
                h.push(i);
            }
            
           else if(i=='[')
            {
                h.push(i);
            }
            
           else if(i=='{')
            {
                h.push(i);
            }
            else if(i==')')
            {
                if(!h.isEmpty())
                {
                    if(h.peek()=='(')
                    {
                        h.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
            else if(i=='}')
            {
                if(!h.isEmpty())
                {
                    if(h.peek()=='{')
                    {
                        h.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
            else if(i==']')
            {
                if(!h.isEmpty())
                {
                    if(h.peek()=='[')
                    {
                        h.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
        }
        if(h.isEmpty())
        {
            return true;
        }
        return false;
    }
}