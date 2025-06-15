class Solution {
    public int maxDiff(int num) {
        String str = Integer.toString(num);
        char x = 0;
        for (char c : str.toCharArray()) {
            if (c != '9') {
                x = c;
                break;
            }
        }
        char y = 0;
        char replace='1';
        for (char c : str.toCharArray()) {
            if (c != '0') {
                if(str.indexOf(c)==0 && c=='1'){
                    continue;
                }
                else if(str.indexOf(c)==0){
                    replace='1';
                    y=c;
                    break;
                }
                else{
                    replace='0';
                    y=c;
                    break;
                }
            }
        }
        String maxStr = str.replace(x, '9');
        String minStr = str.replace(y, replace);
        
        int maxNum = Integer.parseInt(maxStr);
        int minNum = Integer.parseInt(minStr);
        System.out.println(maxNum);
        System.out.println(minNum);
        //System.out.println(str);
        return maxNum - minNum;  
    }
}