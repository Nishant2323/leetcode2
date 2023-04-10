class Solution {
    public String thousandSeparator(int n) {
        String d= n+"";
        StringBuilder s= new StringBuilder(d);
        if(s.length()<=3){
            return s.toString();
        }
        int p =1;
        for(int i=s.length()-1;i>=0;i--){
            if(p == 1000){
                s.insert(i+1,'.');
                p=1;
            }
            p=p*10;
        }
        return s.toString();
    }
}