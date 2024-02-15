/*
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.
  */
class Solution {
    public List<List<String>> solveNQueens(int n) {
        char arr[][]=new char[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]='.';
            }
        }
        List<List<String>> l=new ArrayList<>();
        queen(0,arr,n,l);
        return l;
    }
	public static void queen(int row,char[][] arr,int n,List<List<String>> l) {
		if(n==0) {
			display(arr,l);
			return;
		}
		if(row==arr.length) {
			return ;
		}
		for(int col=0;col<arr[0].length;col++) {
			if(isvalid(arr,row,col)) {
				arr[row][col]='Q';
				queen(row+1,arr,n-1,l);
				arr[row][col]='.';
		}
		}
	}
	public static boolean isvalid(char [][] arr,int r,int c) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i][c]=='Q') {
				return false;
			}
		}
		for(int i=0;i<arr[0].length;i++) {
			if(arr[r][i]=='Q') {
				return false;
			}
		}
		for(int i=r,j=c;i<arr.length&&j<arr[0].length;i=i+1,j=j+1) {
			if(arr[i][j]=='Q') {
				return false;
			}
		}
		for(int i=r,j=c;i>=0 &&j>=0;i=i-1,j=j-1) {
			if(arr[i][j]=='Q') {
				return false;
			}
		}
		for(int i=r,j=c;i<arr.length&&j>=0;i=i+1,j=j-1) {
			if(arr[i][j]=='Q') {
				return false;
			}
		}
		for(int i=r,j=c;i>=0&&j<arr[0].length;i=i-1,j=j+1) {
			if(arr[i][j]=='Q') {
				return false;
			}
		}
		return true;
	}
    public static void display(char[][] arr,List<List<String>> str) {
        ArrayList<String> ls=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
            String ans="";
			for(int j=0;j<arr[0].length;j++) {
				ans=ans+arr[i][j];
			}
            ls.add(ans);
		}
        str.add(ls);

	}
}
