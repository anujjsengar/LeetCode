class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        r=[]
        for i in range(0,len(nums)):
            if(nums[i]==target):
                r.append(i)
        if(len(r)):
            return [r[0],r[-1]]
        else:
            return [-1,-1]

        
