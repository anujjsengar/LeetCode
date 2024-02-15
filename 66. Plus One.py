'''You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.'''
class Solution(object):
    def plusOne(self, digits):
        s=0
        rem=0
        for i in digits:
            s=s*10+i
        ls=[]
        s=s+1
        while(s):
            rem=s%10
            ls.append(rem)
            s=s//10
        return ls[::-1]
