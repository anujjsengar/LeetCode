class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        LinkedHashMap<String , Integer> hm = new LinkedHashMap<>();
        for(int i=0;i< n ;i++){
            for(int j = i+1;j<=n;j++){
                String s1=s.substring(i,j);
              if(!hm.containsKey(s1)){
                 hm.put(s1,1);
              }else{
                hm.put(s1, hm.get(s1)+1);
              }
            }
        }
        String ans = "";
        for(String str : hm.keySet()){
            System.out.println(str+" "+hm.get(str));
            if(check(str) && hm.get(str)>=3){
                if(ans.length()<str.length()){
                    ans = str;
                }
            }
        }
         return ans.length()==0 ? -1 : ans.length();
    }
    public boolean check(String s1){
        char[] ch=s1.toCharArray();
                for(int k=0;k<ch.length-1;k++){
                    if(ch[k]!=ch[k+1]){
                        return false;
                    }
                }
                return true;
    }
   
}