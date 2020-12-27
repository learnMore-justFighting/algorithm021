    public int search(int[] nums, int target) {
        //搜索旋转数组
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int middle=left+(right-left)/2;
            if(nums[middle]==target){
                return middle;
            }
            if(nums[middle]>=nums[left]){
                if(target>=nums[left]&&target<nums[middle]){
                    right=middle-1;
                }else{
                    left=middle+1;
                }            
            }else{
                if(target>nums[middle]&&target<=nums[right]){
                    left=middle+1;
                }else{
                    right=middle-1;
                }
            }
        }
        return -1;
    }
