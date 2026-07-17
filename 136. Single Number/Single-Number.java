class Solution {
    public int singleNumber(int[] nums) {
        // for(int i =0; i<nums.length; i++){
        //     int num = nums[i];
        //    int counti = 0;
        //     for(int j = 0; j<nums.length; j++){
        //        if(nums[j]==num) {
        //         counti++;
        //        }
        //     }
        //        if(counti==1){
        //        return num;
        //        }
            
        // }
        // return -1;

        // OPTIMAL APPROACH

       int XOR = 0;
       for(int i =0; i<nums.length; i++){
        XOR = XOR^nums[i];
       }
       return XOR;
    }
}