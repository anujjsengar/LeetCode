class Solution {
    public int minimumLength(String s) {
        int[] freqarr = new int[26];
        int count = 0;
        for(char c : s.toCharArray()){
            freqarr[c - 'a']++;
        } 
        for(int freq : freqarr){
            if(freq == 0) continue;
            if(freq % 2 == 0){
                count += 2;
            } else{
                count += 1;
            }
        }
        return count;
    }
}