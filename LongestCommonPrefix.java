class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i <strs.length; i++)
        {
            prefix=comparator(prefix,strs[i]);
        }
        return prefix;
    }
    
    public String comparator(String prefix, String s1)
    {
        StringBuilder newPrefix = new StringBuilder();
        int length = (prefix.length() < s1.length()) ? prefix.length() : s1.length();
        for(int i=0; i<length; i++)
        {
            if(prefix.charAt(i) == s1.charAt(i))
            {
                newPrefix.append(prefix.charAt(i));
            }
            else
            {
                break;
            }
        }
        return newPrefix.toString();
    }
}
