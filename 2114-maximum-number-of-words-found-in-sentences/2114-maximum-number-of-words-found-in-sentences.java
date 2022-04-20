class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        
        for(int i = 0; i < sentences.length; i++){
            String s = sentences[i];
            int numSpaces = s.length() - s.replaceAll(" ", "").length();
            max = Math.max(max, numSpaces + 1);
        }
        
        return max;
    }
}