class Solution 
{
    public String longestSubsequenceRepeatedK(String s, int K) 
    {
        int n = s.length();

        // Step 1: Preprocessing - Build a table nextPos[i][c]
        int[][] nextPos = new int[n + 2][26];

        // Step 1.1: Initialize all entries for end positions with n (sentinel value)
        for (int c = 0; c < 26; c++) 
        {
            nextPos[n][c] = nextPos[n + 1][c] = n;
        }

        // Step 1.2: Fill nextPos table in reverse order
        for (int i = n - 1; i >= 0; i--)  // Copy val from nxt row, update pos for curr char
        {
            for (int c = 0; c < 26; c++) 
            {
                nextPos[i][c] = nextPos[i + 1][c];
            }
            
            nextPos[i][s.charAt(i) - 'a'] = i;
        }

        // Step 2: Binary Search on length of repeated subsequence
        int low = 1;
        int high = n / K;
        String res = "";

        while (low <= high) 
        {
            int mid = (low + high) / 2;

            // Step 2.1: Try to build a valid subsequence of length `mid`
            String found = dfsTry(mid, K, 0, new char[mid], s, nextPos);

            if (found != null) 
            {
                // Found a valid subsequence → try for longer
                res = found;
                low = mid + 1;
            } 
            else 
            {
                // No valid subsequence of this length → reduce length
                high = mid - 1;
            }
        }

        return res;
    }

    // Step 3: DFS Backtracking - Build the lexicographically largest subsequence of a given length
    public String dfsTry(int len, int K, int idx, char[] path, String s, int[][] nextPos) 
    {
        if (idx == len) 
        {
            // Step 3.1: If length is reached, validate if path repeated K times is a subsequence
            return canExtend(path, path.length, s, nextPos, K) ? new String(path) : null;
        }

        // Step 3.2: Try all characters in reverse lexicographic order to get largest result
        for (int c = 25; c >= 0; c--) 
        {
            path[idx] = (char) ('a' + c);

            // Step 3.3: Check if current prefix path[0..idx] repeated K times is possible
            if (canExtend(path, idx + 1, s, nextPos, K)) 
            {
                String sub = dfsTry(len, K, idx + 1, path, s, nextPos);
                if (sub != null) 
                {
                    return sub;
                }
            }
        }

        return null;
    }

    // Step 4: Subsequence Validator - Check if (prefix of length d) * K is a subsequence of s
    public boolean canExtend(char[] path, int d, String s, int[][] nextPos, int K) 
    {
        int pos = 0;
        int n = s.length();

        // Step 4.1: Repeat the current prefix K times and simulate if it can fit as a subsequence
        for (int rep = 0; rep < K; rep++) 
        {
            for (int i = 0; i < d; i++) 
            {
                int c = path[i] - 'a';

                // Step 4.2: If character can't be found, return false
                if (pos > n)
                {
                    return false;
                } 

                pos = nextPos[pos][c];
                if (pos == n) 
                {
                    return false;
                }

                pos++;
            }
        }

        return true;
    }

    // Step 5: Wrapper over canExtend for full-length paths
    public boolean checkKtimes(char[] path, String s, int[][] nextPos, int K) 
    {
        return canExtend(path, path.length, s, nextPos, K);
    }
}