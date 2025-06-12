class Solution {
    public boolean stoneGame(int[] piles) {
        HashMap<String,Boolean> set=new HashMap<>();
        return solve(piles,0,piles.length-1,0,0,true,set);
    }
    public boolean solve(int[] piles,int i,int j,int alice,int bob,boolean flag,HashMap<String,Boolean> set){
        if(i>j){
            if(alice>bob){
                return true;
            }
            return false;
        }
        String str=i+"-"+j+"-"+flag;
        if(set.containsKey(str)){
            return set.get(str);
        }
        boolean ans=false;
        if(flag){
            ans=ans || solve(piles,i+1,j,alice+piles[i],bob,false,set);
            ans=ans || solve(piles,i,j-1,alice+piles[j],bob,false,set);
        }
        else{ 
            ans=ans || solve(piles,i+1,j,alice,bob+piles[i],true,set);
            ans=ans || solve(piles,i,j-1,alice,bob+piles[j],true,set);
        }
        set.put(str,ans);
        return ans;
    }
}