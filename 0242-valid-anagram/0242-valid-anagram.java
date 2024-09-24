class Solution {
    public boolean isAnagram(String s, String t) {
        return CreateKey(s).equals(CreateKey(t));
    }
    public String CreateKey(String str){
        int [] arr=new int[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']=arr[str.charAt(i)-'a']+1;
        }
        String key="";
        for(int i:arr){
            key=key+i+",";
        }
        System.out.println(key);
        return key;
    }
}