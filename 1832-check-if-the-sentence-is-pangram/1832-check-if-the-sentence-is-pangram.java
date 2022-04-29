class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < sentence.length(); i++){
            if(!set.contains(sentence.charAt(i))){
                set.add(sentence.charAt(i));
            }
        }
        
        boolean result = true;
        
        if(set.size() == 26){
            result = true;
        }else{
            result = false;
        }
        
        return result;
    }
}