class Solution {
    public String firstPalindrome(String[] words) {
        String ans = "";
        for(int i = 0; i < words.length; i++){
            if(isPalindrome(words[i])){
                ans = words[i];
                break;
            }
        }
        return ans;
    }
    
    public boolean isPalindrome(String s){
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        
        while(left < right){
            if(arr[left] == arr[right]){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}