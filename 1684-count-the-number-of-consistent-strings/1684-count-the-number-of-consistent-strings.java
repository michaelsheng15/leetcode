class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        boolean containsAllowed = true;
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                if(allowed.indexOf(word.charAt(i)) == -1){
                    containsAllowed = false;
                    continue;
                }
            }
            if(containsAllowed){
                count++;
            }
            containsAllowed = true;
        }
        
        return count;
    }
}