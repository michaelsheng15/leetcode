class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                int val = hash.get(nums[i]);
                hash.put(nums[i], val+1);
            }else{
                hash.put(nums[i], 1);
            }            
        }
        
        for(int key : hash.keySet()){
            if(hash.get(key) == 1){
                sum += key;
            }
        }
        System.out.println(hash);
        return sum;
    }
}