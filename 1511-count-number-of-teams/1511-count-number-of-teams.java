class Solution {
    public int numTeams(int[] rating) {
        int ans=0;
        for(int i=0;i<rating.length-2;i++){
            for(int j=i+1;j<rating.length-1;j++){
                if(rating[i]<rating[j]){
                    for(int k=j+1;k<rating.length;k++){
                        if(rating[j]<rating[k]){
                            ans++;
                        }
                    }
                }
                else{
                    for(int k=j+1;k<rating.length;k++){
                        if(rating[j]>rating[k]){
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}