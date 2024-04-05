import  java.util.Arrays;
class threeSumClosest{
    public int thSumCloset(int[] nums,int target){
        Arrays.sort(nums);
        int sum=0;
        int min=nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                sum=nums[i]+nums[l]+nums[r];
                if(sum<target){
                    l+=1;
                }
                else{
                    r-=1;
                }
                if(Math.abs(sum-target)<Math.abs(min-target))
                    min=sum;
            }
        }
        return min;
    }
}

class threeSC{
    public static void main(String[] args){
            int[] a=new int[]{-1,2,1,-4};
            threeSumClosest o=new threeSumClosest();
            System.out.println(o.thSumCloset(a,1));
        }
}