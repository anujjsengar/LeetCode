class Solution {
    public char findTheDifference(String s, String t) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        for(i=0;i<t.length();i++){
            for(int j=0;j<sb.length();j++){
                if(sb.charAt(j)==t.charAt(i)){
                    sb.deleteCharAt(j);
                    break;
                }
                if(j==sb.length()-1){
                    return t.charAt(i);
                }
            }
        }
        return t.charAt(i-1);
    }
}