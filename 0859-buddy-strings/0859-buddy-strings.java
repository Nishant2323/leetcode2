// class Solution {
//     public boolean buddyStrings(String s, String goal) {
//         if(s.length()!=goal.length()){
//             return false;
//         }
//         char[] sb= s.toCharArray();
//         for(int i =0 ;i<sb.length;i++){
//             for(int j =i+1 ;j<sb.length;j++){
//                 char c = sb[i];
//                 sb[i] = sb[j];
//                 sb[j]=c;
                
//                 if(check(sb,goal)){
//                     return true;
//                 }
//                 c = sb[i];
//                 sb[i] = sb[j];
//                 sb[j]=c;
//             }
//         }
//         return false;
//     }
//     public boolean check(char[] sb , String goal){
//         for(int i = 0 ; i< sb.length ; i++){
//             if(sb[i]!=goal.charAt(i)){
//                 return false;
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        if(s.equals(goal)){
            int [] count = new int[26];
            int c;
            for(int i = 0;i<s.length();i++){
                c = s.charAt(i)-'a';
                count[c]++;
                if(count[c]==2)return true;
            }
            return false;
        }
        
        int index1 = -1;
        int index2 = -1;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != goal.charAt(i)){
                if(index1 == -1) index1 = i;
                else if(index2 == -1) index2 = i;
                else return false;
            }
        }
        if(index2==-1) return false;
        return (s.charAt(index1) == goal.charAt(index2) && s.charAt(index2) == goal.charAt(index1));
    }
}