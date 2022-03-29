class Solution {
    public boolean isAnagram(String s, String t) {
        //iterate through s
        //for each letter of s, check if t contains that letter also
            //if true, remove from t
            //if false, retur false
        //if after loop t is empty then return true
        
        if(s.length() != t.length()){
            return false;
        }
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        
        for(int i = 0; i < sArr.length; i++){
            if(sArr[i] != tArr[i]){
                return false;
            }
        }
        return true;
        
    }
}