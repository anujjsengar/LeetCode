class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLen = 0;
        int start = 0;
        HashMap<Character, Integer> freq = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            while (freq.get(c) > 2) {
                char startChar = s.charAt(start);
                freq.put(startChar, freq.get(startChar) - 1);
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}
