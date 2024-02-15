/*
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

 

Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
*/
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean [] bool=new boolean[nums.length];
        ArrayList<Integer> ans=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        permute(nums,bool,ans,list);
        return list;
    }
     public void permute(int[] nums,boolean[] bool,ArrayList<Integer> ans,List<List<Integer>> list){
         if(ans.size()==nums.length){
            if(check(ans,list)){
             list.add(new ArrayList<>(ans));
            }
             return ;
         }
         for(int i=0;i<nums.length;i++){
             if(bool[i]==false){
                 bool[i]=true;
                 ans.add(nums[i]);
                 permute(nums,bool,ans,list);
                 ans.remove(ans.size()-1);
                bool[i]=false;
             }
         }
     }
      public static boolean check(ArrayList<Integer> ans,List<List<Integer>> list){
        if(list.indexOf(ans)==-1){
            return true;
        }
        else{
            return false;
        }
    }
}
