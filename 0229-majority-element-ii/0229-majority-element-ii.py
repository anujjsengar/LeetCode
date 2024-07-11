class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        li=[]
        for i in nums:
            if nums.count(i)>len(nums)/3 and i not in li:
                li.append(i)
        return li
        