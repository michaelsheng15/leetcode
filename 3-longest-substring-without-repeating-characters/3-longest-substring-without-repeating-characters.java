class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> chars = new HashSet();
        int left = 0;
        int right = 0;
        int max = 0;
       
        while(right < s.length()){
            if(chars.contains(s.charAt(right))){
                left++;
                right = left;
                chars.clear();
            }else{
                chars.add(s.charAt(right));
                right++;
            }
            
            if(right - left > max){
                max = right - left;
            }
        }
        
        return max;
    }
}
      
                                                         
//pw
