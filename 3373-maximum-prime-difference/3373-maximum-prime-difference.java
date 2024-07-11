import java.util.*;
class Solution {
    public int maximumPrimeDifference(int[] nums) {
        ArrayList<Integer> li=new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1 && check(nums[i])){
                li.add(i);
            }
        }
        return Collections.max(li)-Collections.min(li);
    }
    public boolean check(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}