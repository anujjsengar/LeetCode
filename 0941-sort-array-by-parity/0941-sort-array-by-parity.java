class Solution {
    public int[] sortArrayByParity(int[] nums) {
        /*PriorityQueue<Integer>pq=new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer a,Integer b){
                if(a%2!=0 && b%2==0){
                    return 1;
                }
                return 0;
            }
        });
        int index=0;
        while(!pq.isEmpty()){
            nums[index]=pq.poll();
            index++;
        }
        return nums;*/
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
               for(int j=i+1;j<nums.length;j++){
                if(nums[j]%2==0){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
               } 
            }
        }
        return nums;
    }
}