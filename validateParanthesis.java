class Solution {
    public boolean isValid(String s) {
        
        Map<Character, Character> pair = new HashMap<>();
        pair.put(')','(');
        pair.put('}','{');
        pair.put(']','[');
        
        Stack<Character> stack = new Stack<>();
        if(s.charAt(0) == ')'){
            return false;
        }
        if(s.charAt(0) == '}'){
            return false;
        }
        if(s.charAt(0) == ']'){
            return false;
        }
        stack.add(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(pair.containsKey(s.charAt(i)) && !stack.isEmpty() && stack.peek() == pair.get(s.charAt(i))){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));               
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
