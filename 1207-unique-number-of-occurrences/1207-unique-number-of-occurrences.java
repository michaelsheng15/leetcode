class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        boolean result = true;
        
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                int count = map.get(arr[i]);
                map.put(arr[i], count+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        
        for(int num : map.keySet()){
            if(set.contains(map.get(num))){
                result = false;
                break;
            }else{
                set.add(map.get(num));
            }
        }
        
        
        return result;
    }
}