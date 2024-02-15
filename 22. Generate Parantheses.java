/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
*/
class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> arr=new ArrayList<>();
		generate(n,0,0,"",arr);
		return arr;    
    }
    private static void generate(int n,int open,int close,String ans,ArrayList<String> list) {
		if(n==open && n==close) {
			list.add(ans);
			//System.out.println(ans);
			return ;
		}
		if(open<n && close<n && open>=close) {
			generate(n,open+1,close,ans+"(",list);
			generate(n,open,close+1,ans+")",list);
		}
		if(open==n && close<n) {
			generate(n,open,close+1,ans+")",list);
		}
}
}
