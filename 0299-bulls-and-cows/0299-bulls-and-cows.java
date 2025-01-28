class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)== guess.charAt(i)){
                bull++;
                if(i!=0){
                    guess = guess.substring(0,i)+"X"+guess.substring(i+1);
                }else{
                    guess = "X"+guess.substring(1);
                }
            }else{
                char c =secret.charAt(i);
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }else{
                    map.put(c,1);
                }
            }
        }
        for(int i=0;i<guess.length();i++){
            char a = guess.charAt(i);
            if(map.containsKey(a)&&map.get(a)==1){
                cow++;
                map.remove(a);
            }else if(map.containsKey(a)&&map.get(a)>1){
                cow++;
                map.put(a,map.get(a)-1);
            }
        }
        return Integer.toString(bull)+"A"+Integer.toString(cow)+"B";

    }
}