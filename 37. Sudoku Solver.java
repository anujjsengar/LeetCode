/*
Write a program to solve a Sudoku puzzle by filling the empty cells.

A sudoku solution must satisfy all of the following rules:

Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells.
*/
class Solution {
    public void solveSudoku(char[][] board) {
        solver(board,0,0);
    }
    private static boolean solver(char[][] grid, int row, int col) {
		if(col==grid[0].length) { 
			col=0;
			row=row+1;
		}
		if(row==grid.length) {
			display(grid);
			return true;
		}
        boolean flag=false;
		if(grid[row][col]!='.') {
			flag=solver(grid,row,col+1);
		}
		else {
			for(char i='1';i<='9';i++) {
				if(isvalid(grid,row,col,i)) {
					grid[row][col]=i;
				flag=solver(grid,row,col+1);
                if(flag==true){
                    return true;
                }
				grid[row][col]='.';
			}
			}
		}
        return flag;
	}

	private static boolean isvalid(char[][] grid, int row, int col, char val) {
		int r=row;
		int c=col;
		for(int i=0;i<grid.length;i++) {
			if(grid[i][c]==val) {
				return false;
			}
		}
		for(int i=0;i<grid[0].length;i++) {
			if(grid[r][i]==val) {
				return false;
			}
		}
		 r=row-(row%3);
		 c=col-(col%3);
		for(int i=r;i<r+3;i++) {
			for(int j=c;j<c+3;j++) {
				if(grid[i][j]==val) return false;
			}
		}
		return true;
	}
	static void display(char[][] grid) {
		for(char i=0;i<grid.length;i++) {
			for(char j=0;j<grid[0].length;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
}
}
