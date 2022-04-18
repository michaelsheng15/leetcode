class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int flipCount = 0;
        int count = 0;
        int max = 0;
        
        while(right < nums.length){
            if(nums[right] == 1){
                right++;
                count++;
            }else{
                if(flipCount < k){
                    flipCount++;
                    right++;
                    count++;
                }else{
                    left++;
                    right = left;
                    max = Math.max(max, count);
                    count = 0;
                    flipCount = 0;
                }
            }
            
            max = Math.max(max, count);

        }
        return max;
    }
}