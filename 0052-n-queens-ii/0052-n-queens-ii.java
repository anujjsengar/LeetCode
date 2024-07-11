class Solution {
    static int count=0;
    public int totalNQueens(int n) {
        count=0;
        int arr[][]=new int[n][n];
        queen(0,arr,n);
        if(n==1)
        return 1;
        return count;
    }
    public static void queen(int row,int[][] arr,int n) {
		if(n==0) {
			count++;
			return;
		}
		if(row==arr.length) {
			return ;
		}
		for(int col=0;col<arr[0].length;col++) {
			if(isvalid(arr,row,col)) {
				arr[row][col]=1;
				queen(row+1,arr,n-1);
				arr[row][col]=0;
		}
		}
	}
	public static boolean isvalid(int[][] arr,int r,int c) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i][c]==1) {
				return false;
			}
		}
		for(int i=0;i<arr[0].length;i++) {
			if(arr[r][i]==1) {
				return false;
			}
		}
		for(int i=r,j=c;i<arr.length&&j<arr[0].length;i=i+1,j=j+1) {
			if(arr[i][j]==1) {
				return false;
			}
		}
		for(int i=r,j=c;i>=0 &&j>=0;i=i-1,j=j-1) {
			if(arr[i][j]==1) {
				return false;
			}
		}
		for(int i=r,j=c;i<arr.length&&j>=0;i=i+1,j=j-1) {
			if(arr[i][j]==1) {
				return false;
			}
		}
		for(int i=r,j=c;i>=0&&j<arr[0].length;i=i-1,j=j+1) {
			if(arr[i][j]==1) {
				return false;
			}
		}
		return true;
	}
}