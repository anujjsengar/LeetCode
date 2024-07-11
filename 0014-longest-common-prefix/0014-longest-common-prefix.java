class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder s = new StringBuilder();
        int left = 0;
        
        while (left < strs[0].length()) {
            char ch = strs[0].charAt(left);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() <= left || strs[i].charAt(left) != ch) {
                    return s.toString();
                }
            }
            s.append(ch);
            left++;
        }
        return s.toString();
    }
}
