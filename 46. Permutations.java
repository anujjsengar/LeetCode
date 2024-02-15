/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]
*/
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
		List<List<Integer>> li=new ArrayList<>();
        boolean [] bool=new boolean[nums.length];
        permut(nums,bool,list,li);
        return li;
    }
    public static void permut(int [] arr,boolean [] bool,ArrayList<Integer> ans,List<List<Integer>> list) {
		if(ans.size()==arr.length) {
			list.add(new ArrayList<>(ans));
            return ;
		}
		for(int i=0;i<arr.length;i++) {
            if(bool[i]==false){
                bool[i]=true;
                ans.add(arr[i]);
            permut(arr,bool,ans,list);
            ans.remove(ans.size()-1);
            bool[i]=false;
            }
        }
		}
	}
