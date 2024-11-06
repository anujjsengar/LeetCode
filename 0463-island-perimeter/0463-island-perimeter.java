class Solution {
    int count=0;
    public int islandPerimeter(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    check(grid,i,j);
                    break;
                }
            }
        }
        return count;
    }
    public void check(int[][] grid,int r,int c){
        if(c==-1 || c==grid[0].length || r==-1 || r==grid.length || grid[r][c]==0){
            count++;
            return ;
        }
        if(grid[r][c]==-1){
            return ;
        }
        grid[r][c]=-1;
        check(grid,r+1,c);
        check(grid,r,c+1);
        check(grid,r-1,c);
        check(grid,r,c-1);
    }
}