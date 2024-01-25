class RemoveDuplicatesSortedArray{
    public static void main(String[] args){
        int count = 0;
        int nums[]=new int[5];
        
        for (int i = 0; i < nums.length; i++) {
         
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
    
            nums[count] = nums[i];
            count++;
        }
    }
}