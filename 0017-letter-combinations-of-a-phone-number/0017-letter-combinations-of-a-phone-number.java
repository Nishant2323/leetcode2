/*
class Solution {
    
    public static void com(int i,HashMap<Character,String> hm,StringBuilder sb,List<String> ans,String s)
    {
        //base condition
        if(i== s.length())
        {
            ans.add(sb.toString());
            return;
        }
        String curr=hm.get(s.charAt(i));
        for(int j=0;j<curr.length();j++)
        {
            sb.append(curr.charAt(j));
            com(i+1,hm,sb,ans,s);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    
    public List<String> letterCombinations(String digits) {
         List<String> ans= new ArrayList();
        if(digits.length()==0)
        {
            return ans;
        }
        HashMap<Character,String> hm = new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
       
        com(0,hm,new StringBuilder(),ans,digits);
        return ans;
    }
}  */
class Solution {


    public void com(int i,HashMap<Character,String> hm,StringBuilder sb,List<String> ans,String n)
    {
      //base condition
        if(i==n.length())
        {
            ans.add(sb.toString());
            return;
        }
        String curr= hm.get(n.charAt(i));
        for(int j=0;j<curr.length();j++)
        {
            sb.append(curr.charAt(j));
            com(i+1,hm,sb,ans,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits)
    {
    List<String> ans= new ArrayList<>();
    if(digits.length()==0)
    {
        return ans;
    }
    HashMap<Character,String> hm= new HashMap<>();
    hm.put('2',"abc");
    hm.put('3',"def");
    hm.put('4',"ghi");
    hm.put('5',"jkl");
    hm.put('6',"mno");
    hm.put('7',"pqrs");
    hm.put('8',"tuv");
    hm.put('9',"wxyz");
    StringBuilder sb=new StringBuilder();
    com(0,hm,sb,ans,digits);
    return ans;
    
}
}    
    