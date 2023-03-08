// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {
// //          int min = Integer.MAX_VALUE;
// //           int sum = 0;
        
// //         for(int i : piles){
// //             sum += i;
// //             min=Math.min(i,min);
// //         }
//        int s= 1;
//         int e = 1000000000;
//          // System.out.println(s);
//          // System.out.println(e);
//         int ans =0;
//         while(s <= e){
//             int mid = (s + e) / 2;
//               System.out.println(mid);
//              int d = (int)check(piles,mid);
//             System.out.println(d);
//             if(d <= h) {
//                 ans=mid;
//                 e = mid - 1;
//             }
//             else if(d > h){
//                 s = mid+1;
//             }
//       }
//      return ans;   
//   }
//    public long check(int[] piles,int mid){
//        long time =0;
//        for(int i: piles){
//             time =time+ (i/mid)+((i%mid!=0)?1:0);
//        }
//        return time;
//    } 
// }
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(blackbox(mid,piles,h)){
                high=mid;
            }
            else
                low=mid+1;
        }
        return low;
    }
    public boolean blackbox(int maxpiles,int[] piles,int h){
        int hours=0;
        for(int i:piles){
            int time=i/maxpiles;
            hours+=time;
            if(i%maxpiles!=0) hours++;
        }
        if(hours<=h)
            return true;
        return false;
    }
}
    