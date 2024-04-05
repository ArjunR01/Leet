class Solution:
    def letterCombinations(self, digits: str) -> list[str]:
        Comb={2:"abc",3:"def",4:"ghi",5:"jkl",6:"mno",7:"pqrs",8:"tuv",9:"wxyz"}
        res=[]
        def backTrack(i,current):
            if(len(current)==len(digits)):
                res.append(current)
                return
            for d in Comb[int(digits[i])]:
                backTrack(i+1,current+d)

        if digits:
            backTrack(0, "")

        return res

o=Solution()
print(o.letterCombinations("32"))