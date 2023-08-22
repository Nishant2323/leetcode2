class Solution {
    public String convertToTitle(int columnNumber) {
        String res="";
        int n=columnNumber;
        while(n>0){
            int h=((n-1)%26)+'A';
            char ch=(char)h;
            res=ch+res;
            n=(n-1)/26;
        }
        return res;
    }
}