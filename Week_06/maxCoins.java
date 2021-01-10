    public int maxCoins(int[] nums) {
        //戳气球
        int n=nums.length;
        int []tem=new int[n+2];
        tem[0]=1;
        tem[n+1]=1;
        for(int i=0;i<n;i++){
            tem[i+1]=nums[i];
        }
        int [][]dp=new int[n+2][n+2];
        for(int len=3;len<=n+2;len++){
            for(int start=0;start<=n+2-len;start++){
                int res=0;
                for(int k=start+1;k<start+len-1;k++){
                    int left=dp[start][k];
                    int right=dp[k][start+len-1];
                    res=Math.max(left+tem[start]*tem[k]*tem[start+len-1]+right,res);   
                }
                dp[start][start+len-1]=res;
            }
        }
        return dp[0][n+1];
    }
