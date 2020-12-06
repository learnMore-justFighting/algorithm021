
    public int removeDuplicates(int[] nums) {
        int count=0;
        int strLength=nums.length;
        int i=0;
        for(int j=1;j<strLength;j++){
            if(nums[j]==nums[i]){
                count++;
            }else{
                nums[j-count]=nums[j];
                i++;
                }
            }
        return strLength-count;
    }
