class Solution {
    public int minMaxDifference(int num) {
        String str = Integer.toString(num);
        char x = 0;
        for (char c : str.toCharArray()) {
            if (c != '9') {
                x = c;
                break;
            }
        }
        char y = 0;
        for (char c : str.toCharArray()) {
            if (c != '0') {
                y = c;
                break;
            }
        }
        String maxStr = str.replace(x, '9');
        String minStr = str.replace(y, '0'); 
        int maxNum = Integer.parseInt(maxStr);
        int minNum = Integer.parseInt(minStr); 
        return maxNum - minNum;
    }
}
