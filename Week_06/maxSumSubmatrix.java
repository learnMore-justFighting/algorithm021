    public int maxSumSubmatrix(int[][] matrix, int k) {
        //矩形区域不超过k的最大数值和
        int rows=matrix.length;
        int cols=matrix[0].length;
        int max=Integer.MIN_VALUE;
        for(int l=0;l<cols;l++){
            int []rowSum=new int[rows];
            for(int r=l;r<cols;r++){
                for(int i=0;i<rows;i++){
                    rowSum[i]+=matrix[i][r];
                }
                max=Math.max(max,dp(rowSum,k));
            }
        }
        return max;
    }
    int dp(int[]rowSum,int k){
        int rowsum=rowSum[0];
        int rowMax=rowsum;
        int res=Integer.MIN_VALUE;
        for(int i=1;i<rowSum.length;i++){
            if(rowsum>0){
                rowsum+=rowSum[i];
            }else{
                rowsum=rowSum[i];
            }
            rowMax=Math.max(rowsum,rowMax);
        }
        if(rowMax<=k){
            return rowMax;
        }
        int max=Integer.MIN_VALUE;
        for(int l=0;l<rowSum.length;l++){
            int sum=0;
            for(int r=l;r<rowSum.length;r++){
                sum+=rowSum[r];
                if(sum>max&&sum<=k)max=sum;
                if(max==k)return max;
            }
        }
        return max;
    }
