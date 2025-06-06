class Solution {
    public String robotWithString(String s) {
        int n = s.length();
        int[] minChar = new int[n];
        minChar[n - 1] = s.charAt(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            minChar[i] = Math.min(s.charAt(i), minChar[i + 1]);
        }
        StringBuilder result = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();
        int i = 0;
        while (i < n) {
            stack.push(s.charAt(i));
            while (!stack.isEmpty() && (i == n - 1 || stack.peek() <= minChar[i + 1])) {
                result.append(stack.pop());
            }
            i++;
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}
