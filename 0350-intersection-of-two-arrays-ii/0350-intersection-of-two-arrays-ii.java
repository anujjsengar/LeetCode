class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int left=0;
        int right=0;
        ArrayList<Integer> index=new ArrayList<>();
        while(right<nums2.length && left<nums1.length){
            if(nums1[left]==nums2[right] && !index.contains(right)){
                index.add(right);
                left++;
                right=0;
                continue;
            }
            if(right==nums2.length-1){
                left++;
                right=0;
                continue;
            }
            right++;
        }
        int[] arr=new int[index.size()];
        for(int i=0;i<index.size();i++){
            arr[i]=nums2[index.get(i)];
        }
        return arr;
    }
}