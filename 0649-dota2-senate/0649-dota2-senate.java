// class Solution {
//     public String predictPartyVictory(String senate) {
//         Queue<Character> q = new LinkedList<>();
//         for(int i=0;i<senate.length();i++){
//             q.add(senate.charAt(i));
//         }
//          System.out.println("Queue: " + q);
//         while(true){
//             if(helper(q)==true|| q.size()==1){
//                 break;
//             }
//             else{
//                 char i = '.';
//                 char j = '.';
                
//                      i = q.remove();
//                System.out.println(i);
                
               
//                      j = q.remove();
//                  System.out.println(i);
                
                
//                 if(i==j){
//                     q.add(i);
//                     q.add(j);
//                 }
//                 else{
//                     q.add(i);
//                 }
//             }
//         }
//         return q.remove()+"";
//     }
//     public boolean helper(Queue<Character> q ){
//         String s = "";
//         boolean f= true;
//         while(!q.isEmpty()){
//             s = s+q.remove();
//         }
//         for(int i=1;i<s.length();i++){
//             if(s.charAt(i)!=s.charAt(i-1)){
//                 f= false;
//                 break;
//             }
//         }
//         for(int i=1;i<s.length();i++){
//             q.add(s.charAt(i));
//         }
//         return f;
//     }
// }
class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> qr = new LinkedList<>();
        Queue<Integer> qd = new LinkedList<>();
        for(int i =0;i<senate.length();i++){
            if(senate.charAt(i)=='R'){
                qr.add(i);
            }
            else{
                qd.add(i);
            }
        }
        System.out.println(qr);
        System.out.println(qd);
        while(!qr.isEmpty()&&!qd.isEmpty() ){
           int i= qr.element();
            int j = qd.element();
            qr.remove();
            qd.remove();
            if(i<j){
                qr.add(i+senate.length()+1);
            }
            else{
                qd.add(j+senate.length()+1);
            }
            
        }
        if(qr.size()>qd.size()){
            return "Radiant";
        }
        return "Dire";
    }
}
    