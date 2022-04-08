class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 1;
        int right= k;
        double sum = 0;
        double max = 0;
        
        for(int i = 0; i < k; i++){
            sum+=nums[i]; 
        }
        
        max = sum;
        
        while(right < nums.length){
            sum += nums[right];
            sum -= nums[left-1];
            max = Math.max(max, sum);
            right++;
            left++; 
        }
        return max/k;
    }
}

