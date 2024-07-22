class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length-1;i++){
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]<heights[j]){
                    int temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;
                    String s=names[i];
                    names[i]=names[j];
                    names[j]=s;
                }
            }
        }
        System.out.println(heights);
        return names;
    }
}