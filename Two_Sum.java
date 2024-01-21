import java.util.Arrays;
public class Two_Sum {
    public static int[] main(int[] nums, int target){
        // int count=0;
        // int nums[]=new int[]{1,2,3,4,5};
        nums=new int[]{1,2,3,4,5};
        int result[]=new int[2];
        target=5;
        int t1=0,t2=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    t1=i;
                    t2=j;
                    break;
                }
                
            }
        }
        return new int[]{t1,t2};
        // System.out.println(Arrays.toString(result));
        // System.out.println(nums.length);
        
    }
}
 
