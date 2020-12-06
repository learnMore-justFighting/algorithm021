    public int trap(int[] height){
        int sum=0;
        int n=height.length;
        int [] maxleft=new int[n];
        int [] maxRight=new int[n];
        for(int i=1;i<n;i++){
            maxleft[i]=Math.max(maxleft[i-1],height[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            maxRight[i]=Math.max(maxRight[i+1],height[i+1]);
        }
        for(int i=1;i<n-1;i++){
            int min=Math.min(maxleft[i],maxRight[i]);
            if(height[i]<min){
                sum+=(min-height[i]);
            }
        }
        return sum;
    }
