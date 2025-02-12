class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int x=0;
        for(int i:derived){
            x=x^i;
        }
        return x==0;
    }
}
