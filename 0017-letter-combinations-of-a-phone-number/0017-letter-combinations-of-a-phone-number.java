class Solution {
    public List<String> letterCombinations(String digits) {
        String[] keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
         List<String> li=new ArrayList<>();
if(digits.length()==0) return li;
          combine(digits,keypad,"",li,0);

return li;
    }
    public void combine(String digits,String[] keypad,String ans,List<String> li,int ind){
        if(ans.length()==digits.length()){
            li.add(ans);
            return ;
        }

        char ch =digits.charAt(ind);
        String str=keypad[ch-'0'];
        for(int i=0;i<str.length();i++){
            combine(digits,keypad,ans+str.charAt(i),li,ind+1);
        }

    }
}