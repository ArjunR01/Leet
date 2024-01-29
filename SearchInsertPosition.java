import java.util.Arrays;

class SearchInsertPosition{
    public static void main(String[] args){
        int nums[]=new int[]{1,3,5,6};
        Arrays.sort(nums);
        int target=5;
        int i;
       for(i=0;i<nums.length;i++){
        if(target<=nums[i]){
            break;
        }
       }
       System.out.println("target="+(i));
    }
}