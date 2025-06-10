class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int maxeven=Integer.MIN_VALUE;
        int mineven=Integer.MAX_VALUE;
        int maxodd=Integer.MIN_VALUE;
        int minodd=Integer.MAX_VALUE;
        for(char c:s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,0);
            }
            map.put(c,map.get(c)+1);
        }
        for(char c:map.keySet()){
            int x=map.get(c);
            if(x%2==0){
                mineven=Math.min(mineven,x);
                maxeven=Math.max(maxeven,x);
            }
            else{
                minodd=Math.min(minodd,x);
                maxodd=Math.max(maxodd,x);
            }
        }
        System.out.println(minodd);
        System.out.println(maxodd);
        System.out.println(mineven);
        System.out.println(maxeven);
        if((minodd-maxeven)>(maxodd-mineven)){
            return minodd-maxeven;
        }
        return maxodd-mineven;
    }
}