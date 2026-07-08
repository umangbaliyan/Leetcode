class Solution {
    public int findMin(int[] nums) {
         int left = 0; 
        int right = nums.length -1;

        while(left<right){
            int mid = left + (right - left) / 2;

            if(nums[mid] > nums[right]){
                left = mid + 1;
            }
            else{
                right = mid;  
                // yha mid hi aega mid -1 nhi vrna minimum chut janeke chances h
            }
        }
        // return nums[left]; YE bHI CHLEGA KYUKI LEFT AND RIGHT DONO EK HI HOGYE
        return nums[right];
    }
}


// while(left<=right){
//             int mid = left + (right - left) / 2;

//             if(nums[mid] > nums[right]){
//                 left = mid + 1;
//             }
//             else if(nums[mid] < nums[right]){
//                 right = mid;  
//                 // yha mid hi aega mid -1 nhi vrna minimum chut janeke chances h
//             }
//             else if(nums[mid] == nums[right]){
//                 return nums[mid];
//             }
//         }
//          return -1;
//     }
// }
