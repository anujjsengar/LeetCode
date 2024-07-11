class Solution {
    public List<Integer> lexicalOrder(int n) {
        String [] ch=new String[n];
        List<String> li=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            //ch[i-1]=i+"";
            li.add(i+"");
        }
        Collections.sort(li);
        /*Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
        for(int i=0;i<ch.length;i++){
            li.add(Integer.parseInt(ch[i]));
        }*/
        System.out.println(li);
        for(int i = 0; i <li.size(); i++) {
   l.add(Integer.parseInt(li.get(i)));   
}
return l;
    }
}