// class Solution {
//     public long zeroFilledSubarray(int[] nums) {
//         long count =0;
//         int  i= 0;
//         int  j = 0;
//         while(i<nums.length){
//             if(nums[i]!=0){
//                 i++;
//             }
//             else{
//                 j=i;
//                 while(j<nums.length && nums[j]==0){
//                     count++;
//                     j++;
//                 }
//                 i++;
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long contCount = 0;
        long subarrays = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                contCount++;
            }
            else{
                subarrays += (contCount*(contCount+1)/2);
                contCount=0;
            }
        }
        // if the last element was 0, we need to calculate for it
        if(contCount>0){
            subarrays += (contCount*(contCount+1)/2);
        }
        return subarrays;
    }
}