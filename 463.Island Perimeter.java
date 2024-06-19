/*You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.

Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).

The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.*/
class Solution {
    public int islandPerimeter(int[][] grid) {
        int counter=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    counter=counter+check(grid,i,j);
                }
            }
        }
        return counter;
    }
      public static int check(int [][]grid,int row,int col){
        int count=0;
     if(col+1==grid[0].length || grid[row][col+1]==0){
        count++;
     }
     if(col-1==-1 || grid[row][col-1]==0){
        count++;
     }
     if(row+1==grid.length || grid[row+1][col]==0){
        count++;
     }
     if(row-1==-1 || grid[row-1][col]==0){
        count++;
     }
     return count;
    }
}


