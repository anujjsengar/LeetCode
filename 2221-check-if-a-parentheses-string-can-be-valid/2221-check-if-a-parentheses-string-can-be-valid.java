class Solution {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 != 0) {
            return false;
        }

        int open = 0;
        int close = 0;
        for (int i = 0; i < s.length(); i++) {
            if (locked.charAt(i) == '0' || s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
            if (close > open) {
                return false;
            }
        }
        open = 0;
        close = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (locked.charAt(i) == '0' || s.charAt(i) == ')') {
                close++;
            } else {
                open++;
            }

            if (open > close) {
                return false;
            }
        }

        return true;
    }
}