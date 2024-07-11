class Solution {
    public boolean isValid(String s) {
        while(s.length()!=0 && (s.contains("()") || s.contains("{}") || s.contains("[]"))){
            s=s.replace("()","").replace("{}","").replace("[]","");
        }
        if(s.length()==0){
            return true;
        }
        return false;
    }
}