class Solution {
    public boolean stoneGame(int[] piles) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i:piles){
            li.add(i);
        }
        return solve(li,0,0,true);
    }
    public boolean solve(ArrayList<Integer> li,int alice,int bob,boolean flag){
        if(li.size()==0){
            if(alice>bob){
                return true;
            }
            return false;
        }
        boolean ans=false;
        if(flag){
            int temp=li.get(0);
            li.remove(0);
            ans=ans || solve(li,alice+temp,bob,false);
            li.add(0,temp);
            int temp2=li.get(li.size()-1);
            li.remove(li.size()-1);
            ans=ans || solve(li,alice+temp2,bob,false);
            li.add(temp2);
        }
        else{
            int temp=li.get(0);
            li.remove(0);
            ans=ans || solve(li,alice,bob+temp,true);
            li.add(0,temp);
            int temp2=li.get(li.size()-1);
            li.remove(li.size()-1);
            ans=ans || solve(li,alice,bob+temp2,true);
            li.add(temp2);
        }
        return ans;
    }
}