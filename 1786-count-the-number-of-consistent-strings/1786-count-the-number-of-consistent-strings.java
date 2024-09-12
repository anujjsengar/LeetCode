class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       int count=0;
       for(String s : words){
        count=count+1;
        for(int i=0;i<s.length();i++){
            if(!allowed.contains(""+s.charAt(i))){
                count--;
                break;
            }
        }
       }
       return count;
    }
}