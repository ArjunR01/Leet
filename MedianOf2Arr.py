def Median(nums1,nums2):
    n1=len(nums1)
    n2=len(nums2)
    if(n1>n2):
        Median(nums2,nums1)
    l=0
    r=n1
    while(l<=r):
        p1=l+r/2
        p2=((n1+n2)/2)-p1
        ALeft=nums1[p1] if p1>=0 else float("-infinity")
        ARight=nums1[p1+1] if p1+1<len(nums1) else float("infinity")
        BLeft=nums2[p2] if p2>=0 else float("-infinity")
        BRight=nums2[p2+1] if p2+1<len(nums2) else float("infinity")

        if ALeft<BRight and BLeft<ARight:
            if((n1+n2)%2==0):
                return((max(ALeft,BLeft)+min(ARight,BRight))/2)
            else:
                return(max(ARight,BRight))
        elif ALeft>BRight:
            r-=1
        else:
            l+=1

