class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] bool=new boolean[nums.length];
        sub(nums,bool,ans,list,0);
        return list;
    }
    public static void sub(int[] arr,boolean[]bool,ArrayList<Integer> ans,List<List<Integer>> list,int lp){
        if(!list.contains(ans)){
            list.add(new ArrayList<>(ans));
        }
        if(ans.size()==arr.length){
            return ;
        }
        for(int i=lp;i<arr.length;i++){
            if(bool[i]==false){
            bool[i]=true;
            ans.add(arr[i]);
            sub(arr,bool,ans,list,i+1);
            ans.remove(ans.size()-1);
            bool[i]=false;
        }
        
    }
}
}