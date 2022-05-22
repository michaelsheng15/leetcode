class Solution {
    public int[] productExceptSelf(int[] nums) {
        //loop from left and for element find product of all element before it
        //loop from right and find product of all elements before
        //multiply 2 arrays together
        
        int product = 1;
        int[] arr = new int[nums.length];

        arr[0] = 1;
        for(int i = 1; i < nums.length; i++){
            product *= nums[i-1];
            arr[i] = product;
        }
        
        product = 1;
        for(int i = nums.length-2; i >= 0; i--){
            product *= nums[i+1];
            arr[i] *= product;
        }
        
        return arr;
        
    }
}