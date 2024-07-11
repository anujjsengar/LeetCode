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


