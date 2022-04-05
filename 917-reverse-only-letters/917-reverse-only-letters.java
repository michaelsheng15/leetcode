class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
            
        int left = 0;
        int right = arr.length - 1;
        char temp = 'a';
        
        while(left < right){
            if((arr[left] < 'A') || (arr[left] >'Z' && arr[left] < 'a')){
                left++;
                continue;
            }else if ((arr[right] < 'A') || (arr[right] >'Z' && arr[right] < 'a')){
                right--;
                continue;
            }
            
            //both are characters so swap
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;  
        }
        System.out.print(arr); 
        String out = String.valueOf(arr);
        return out;
    }
}