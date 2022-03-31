class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        int pivot = (nums.length-1) / 2;
        
        
        while(left <= right){
            if(nums[pivot] > target){
                right = pivot - 1;
            }else if (nums[pivot] < target){
                left = pivot + 1;
            }else if (nums[pivot] == target){
                return pivot;
            }
            pivot = (right + left)/2;
        }
        return -1;
    }
}