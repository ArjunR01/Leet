Arrays.sort(nums);
int sum=0;
for(int i=0;i<nums.length;i++){
    int a=nums[i];
    int l=i+1;
    int r=nums.length-1;
    while(l<r){
        sum=a+nums[l]+nums[r];
        if(sum<target){
            l+=1;
        }
        else if(sum>target){
            r-=1;
        }
        else{
            return sum;
        }
    }
}
return sum;  