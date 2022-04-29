class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        boolean equalOccurences = true;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                //pull and increment
                int count = map.get(s.charAt(i));
                map.put(s.charAt(i), count + 1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        
        HashSet<Integer> values = new HashSet<Integer>(map.values());
        if(values.size() == 1){
            equalOccurences = true;
        }else{
            equalOccurences = false;
        }        
        return equalOccurences;
    }
}