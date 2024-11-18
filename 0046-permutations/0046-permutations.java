class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        boolean bool[]=new boolean[nums.length];
        solve(nums,bool,li,list);
        return list;
    }
    public void solve(int[] nums,boolean[] bool,List<Integer> li,List<List<Integer>> list){
        if(li.size()==nums.length){
            list.add(new ArrayList<>(li));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(!bool[i]){
                bool[i]=true;
                li.add(nums[i]);
                solve(nums,bool,li,list);
                li.remove(li.size()-1);
                bool[i]=false;
            }
        }
    }
}