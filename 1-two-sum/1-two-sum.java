class Solution {
    public int[] twoSum(int[] nums, int target) {
        //two pointer approach
        // 2 fors - scan throough fors from i and 1+i
        //check sum of indexes for target val
        
        int[] result = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            for(int k = i+1; k < nums.length; k++){
                if(nums[i] + nums[k] == target){
                    result[0] = i; 
                    result[1] = k;
                }
            }
        }
        return result;
    }
}