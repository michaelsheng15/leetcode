class Solution {
    public boolean isPalindrome(int x) {        
        char[] str = Integer.toString(x).toCharArray();
        int p1 = 0;
        int p2 = str.length-1;
        while(p1 <= p2){
            if(str[p1] == str[p2]) {
                p1++;
                p2--;
            }else{
                return false;
            }
        }
        return true;
    }
}