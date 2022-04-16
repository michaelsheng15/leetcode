class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(char i : arr){
            if(i == '('){
                stack.push(')');
            }else if (i == '{'){
                stack.push('}');
            }else if (i == '['){
                stack.push(']');
            }else if (!stack.empty()){
                if (i != stack.pop()){
                    return false;
                }else{
                    continue;
                }
            }else{
                return false;
            }
        }
        
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
        
    }
}