    public List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        backTrack(res,n,0,0,"");
        return res;
    }
    void backTrack(List<String>res,int n,int left,int right,String s){
        if(left==n&&right==n){
            res.add(s);
            return;
        }
        if(left<right){
            return;
        }
        if(left<n){
            s+="(";
            backTrack(res,n,left+1,right,s);
            s = s.substring(0,s.length()-1);
        }
        if(right<left){
            s+=")";
            backTrack(res,n,left,right+1,s);
            s = s.substring(0,s.length()-1);
        }

    }
