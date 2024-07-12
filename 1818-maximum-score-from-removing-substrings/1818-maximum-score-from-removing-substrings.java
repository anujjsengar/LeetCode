import java.util.Stack;

class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return calculateScore(s, "ab", x, "ba", y);
        } else {
            return calculateScore(s, "ba", y, "ab", x);
        }
    }

    private int calculateScore(String s, String highPair, int highScore, String lowPair, int lowScore) {
        int score = 0;
        Stack<Character> stack = new Stack<>();
        
        // First pass to remove high score pairs
        StringBuilder remaining = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == highPair.charAt(0) && c == highPair.charAt(1)) {
                stack.pop();
                score += highScore;
            } else {
                stack.push(c);
            }
        }
        
        while (!stack.isEmpty()) {
            remaining.insert(0, stack.pop());
        }
        
        // Second pass to remove low score pairs
        stack.clear();
        for (char c : remaining.toString().toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == lowPair.charAt(0) && c == lowPair.charAt(1)) {
                stack.pop();
                score += lowScore;
            } else {
                stack.push(c);
            }
        }
        
        return score;
    }
}
