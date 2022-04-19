class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int deleteCount = 0;
        int count = 0;
        int max = 0;
        
        while(right < nums.length){
            if(nums[right] == 1){
                count++;
                right++;
            }else{
                if(deleteCount < 1){
                    deleteCount++;
                    right++;
                    count++;
                }else{
                    left++;
                    right = left;
                    max = Math.max(max, count);
                    count = 0;
                    deleteCount = 0;
                }
            }
            
            max = Math.max(max, count);
        }
        
        return max - 1;
    }
}