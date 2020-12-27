    public int maxProfit(int[] prices) {
        //买卖股票的最佳时机（可多次）
        //动态规划方法
        int []dp=new int[2];
        dp[0]=0;//两种状态，不持有，持有
        dp[1]=-prices[0];
        for(int i=1;i<prices.length;i++){
            dp[0]=Math.max(dp[0],dp[1]+prices[i]);
            dp[1]=Math.max(dp[0]-prices[i],dp[1]);
        }
        return dp[0];
        if(prices.length<2){
            return 0;
        }
        //贪心算法
        int profit=0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1]){
                profit+=(prices[i]-prices[i-1]);
            }
        }
        return profit;       
    }
