class Solution:
    def fourSum(self, nums: list[int], target: int) -> list[list[int]]:
        res=[[]] 
        li=[]  
        sum=0
        nums.sort()
        for i,a in enumerate(nums):
            if(i>0 and nums[i-1]== a):
                continue
            l=i+1
            m=i+2
            r=len(nums)-1
            while(l<r and l!=m and r!=m):
                sum=nums[i]+nums[l]+nums[m]+nums[r]
                if(sum<target):
                    l+=1
                if(sum>target):
                    r-=1
                else:
                    li.append(nums[i]+nums[l]+nums[m]+nums[r])
                    l+=1
                    res.append(li)
                    while(l<r and nums[l]==nums[l-1] and m==l and m==r ):
                        l+=1
                        r-=1
        return res
o=Solution()
print(o.fourSum([1,0,-1,0,-2,2],0))