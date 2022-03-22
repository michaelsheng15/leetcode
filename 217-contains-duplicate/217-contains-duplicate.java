class Solution {
    public boolean containsDuplicate(int[] nums) {
        //iterate through array
        //check hashmap to see if it exists
            //key - value from num[]
            //value - quantity
        //if true: return true
        //else: add new to hashmap
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i], 1);
            }
        }
        return false;
    }
}