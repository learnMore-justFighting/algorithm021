    public boolean canJump(int[] nums) {
        //跳跃游戏
        int n=nums.length;
        int enable=n-1;
        for (int i = n-1; i >=0 ; i--) {
            if(i+nums[i]>=enable)enable=i;
        }
        return enable==0;
    }
