def generatePare(n):
    inList=[]
    finalList=[]
    def sol(O,C):
        if(O==C==n):
            finalList.append("".join(inList))
            return
        if(O<n):
            inList.append('(')
            sol(O+1,C)
            inList.pop()
        if(C<O):
            inList.append(')')
            sol(O,C+1)
            inList.pop()
    sol(0,0)
    print(finalList)
generatePare(3)
