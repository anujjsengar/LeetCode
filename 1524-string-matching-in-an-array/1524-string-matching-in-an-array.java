class Solution {
    public List<String> stringMatching(String[] words) {
        Arrays.sort(words);
        List<String> li=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(!words[j].equals(words[i]) && words[j].contains(words[i]) && !li.contains(words[i])){
                    li.add(words[i]);
                }
            }
        }
        return li;
    }
}