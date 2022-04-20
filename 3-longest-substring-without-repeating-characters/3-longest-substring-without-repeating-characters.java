class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int count = 0;
        int max = 0;
        
        while(right < s.length()){
            if(set.contains(s.charAt(right))){
                left++;
                right = left;
                set.clear();
                max = Math.max(max, count);
                count = 0;
                
            }else{
                set.add(s.charAt(right));
                count++;
                right++;
            }
            max = Math.max(max, count);

        }
        
        return max;
    }
}
