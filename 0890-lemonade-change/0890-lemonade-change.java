class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0]>5){
            return false;
        }
        Map<Integer,Integer> li=new HashMap<>();
        li.put(5,1);
        li.put(10,0);
        for(int i=1;i<bills.length;i++){
            if(bills[i]==5){
            li.put(5,li.get(5)+1);
            }
            if(bills[i]==10){
                if(li.get(5)==0){
                    return false;
                }
                else{
                    li.put(5,li.get(5)-1);
                    li.put(10,li.get(10)+1);
                }
            }
            if(bills[i]==20){
                if(li.get(5)==0){
                    return false;
                }
                else{
                    li.put(5,li.get(5)-1);
                    if(li.get(10)>0){
                        li.put(10,li.get(10)-1);
                    }
                    else{
                        if(li.get(5)<2){
                            return false;
                        }
                        else{
                            li.put(5,li.get(5)-2);
                        }
                    }
                }
            }
        }return true;
    }
}