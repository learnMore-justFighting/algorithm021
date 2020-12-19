    public List<List<Integer>> combine(int n, int k) {
        //组合
        List<List<Integer>> res=new ArrayList<>();
        Deque<Integer> out=new ArrayDeque<>();
        track(n,1,res,out,k);
        return res;
    }
    public void track(int n,int start,List<List<Integer>>res,Deque<Integer>out,int k){
        if(out.size()==k){
            res.add(new ArrayList<>(out));
            return;
        }
        for(int i=start;i<=n-(k-out.size())+1;i++){
            out.addLast(i);
            track(n,i+1,res,out,k);
            out.removeLast();
        }
    }
