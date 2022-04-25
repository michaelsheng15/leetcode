class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            for(int j = 0; j < nums.length; j++){
                if(curr > nums[j]){
                    count++;
                }
                answer[i] = count;
            }
            count = 0;
        }
        return answer;
    }
}

//length - i + 1