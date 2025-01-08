class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int sp=sentence.indexOf(" ");
        int i=0;
        int counter=0;
        while(sp!=-1){
            counter++;
            if(sentence.substring(i,sp).indexOf(searchWord)==0){
                return counter;
            }
            i=sp+1;
            sp = sentence.indexOf(" ", i);
        }
        if(sentence.substring(i,sentence.length()).indexOf(searchWord)==0){
            return counter+1;
        }
        return -1;
    }
}