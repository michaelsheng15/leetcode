class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int temp = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}

// int left = 0;
//         int right = nums.length-1;
//         int temp = 0;
        
//         while(left < right){
//             if(nums[left] == 0 && nums[right] !=0){
//                 temp = nums[left];
//                 nums[left] = nums[right];
//                 nums[right] = temp;
                
//                 left++;
//                 right--;
//             }else if(nums[left] == 0 && nums[right] == 0){
//                 right--;
//             }else if (nums[left] != 0 && nums[right] == 0){
//                 left++;
//                 right--;
//             }else if (nums[left] != 0 && nums[right] != 0){
//                 left++;
//             }
//         }