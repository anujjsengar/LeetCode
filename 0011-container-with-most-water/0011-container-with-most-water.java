class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            int width=Math.abs(left-right);
            int area=Math.min(height[left],height[right])*width;
            if(area>max){
                max=area;
            }
            if(height[left]>height[right]){
            right--;
            }
            else{
                left++;
            }
        }
        return max;
    }
}