class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.compareTo(word.toUpperCase())==0 || word.compareTo(word.toLowerCase())==0){
            return true;
        }
        if(word.charAt(0)>='A' && word.charAt(0)<='Z' && word.substring(1,word.length()).compareTo(word.substring(1,word.length()).toLowerCase())==0){
            return true;

        }
        return false;
    }
}