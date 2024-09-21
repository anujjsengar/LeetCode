class Solution {
    public List<Integer> lexicalOrder(int n) {
        String [] ch=new String[n];
        List<Integer> li=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ch[i-1]=i+"";
        }
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
        for(int i=0;i<ch.length;i++){
            li.add(Integer.parseInt(ch[i]));
        }
        return li;
    }
}