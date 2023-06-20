class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character, Integer> uniqueNess = new HashMap<>();
        String result = "";
        int maxLength = 0;
        if(s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        
        for(int i=0; i<s.length(); i++){
            if(uniqueNess.containsKey(s.charAt(i))){
                // maxLength = Math.max(maxLength,result.length());
                i=uniqueNess.get(s.charAt(i));
                uniqueNess.clear();
                result="";
            }
            else{
                uniqueNess.put(s.charAt(i),i);
                result+=s.charAt(i);
            }
            maxLength = Math.max(maxLength,result.length());
        }
        return maxLength;
    }
}
