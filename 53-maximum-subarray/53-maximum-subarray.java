class Solution {
    public int maxSubArray(int[] nums) {
        int current = nums[0];
        int global = nums[0];
        
      
        
        for(int i = 1; i < nums.length; i++){
            current = Math.max(nums[i], current + nums[i]);
            if(current > global){
                global = current;
            }
        }            
        return global;
    }
}