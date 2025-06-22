class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = (s.length() + k - 1) / k;
        String[] str = new String[n];
        int i = 0, index = 0;
        
        while (i < s.length()) {
            int end = Math.min(i + k, s.length());
            String ans = s.substring(i, end);
            if (ans.length() < k) {

                StringBuilder sb = new StringBuilder(ans);
                while (sb.length() < k) {
                    sb.append(fill);
                }
                ans = sb.toString();
            }
            str[index++] = ans;
            i += k;
        }
        return str;
    }
}
