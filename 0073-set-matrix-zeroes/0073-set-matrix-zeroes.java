class Solution {
    public void setZeroes(int[][] matrix) {
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int r=0;r<matrix.length;r++){
            for(int c=0;c<matrix[0].length;c++){
                if(matrix[r][c]==0){
                    if(!map.containsKey(r)){
                        map.put(r,new HashSet<>());
                    }
                    map.get(r).add(c);
                }
            }
        }
        for(int r:map.keySet()){
            for(int c:map.get(r)){
                zero(matrix,r,c);
            }
        }
    }
    public void zero(int[][] matrix,int r,int c){
        for(int i=0;i<matrix.length;i++){
            matrix[i][c]=0;
        }
        for(int i=0;i<matrix[0].length;i++){
            matrix[r][i]=0;
        }
    }
}