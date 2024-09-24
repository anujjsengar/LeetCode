class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> li=new ArrayList<>();
        String pkey=CreateKey(p);
        for(int i=0;i<s.length()-(p.length()-1);i++){
            String str=s.substring(i,i+p.length());
            if(pkey.equals(CreateKey(str))){
                li.add(i);
            }
        }
        return li;
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