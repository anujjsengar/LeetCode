class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> li=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap();
        for(String str:strs){
            String key=sorting(str);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        for(String k:map.keySet()){
            li.add(map.get(k));
        }
        return li;
    }
    public String sorting(String str){
        int[] arr=new int[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']=arr[str.charAt(i)-'a']+1;
        }
        String key="";
        for(int a:arr){
            key=key+a+',';
        }
        return key;
    }
}