class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        solve(nums,list,li,0,set,"");
        return list;
    }
    public void solve(int[] nums,List<List<Integer>> list,List<Integer> li,int i,HashSet<String> set,String ans){
        if(li.size()>1 && !set.contains(ans)){
            set.add(ans);
            list.add(new ArrayList<>(li));
        }
        if(i==nums.length){
            return ;
        }
        if(li.size()==0 || li.get(li.size()-1)<=nums[i]){
            li.add(nums[i]);
            solve(nums,list,li,i+1,set,ans+nums[i]+"-");
            li.remove(li.size()-1);
        }
        solve(nums,list,li,i+1,set,ans);
    }
}