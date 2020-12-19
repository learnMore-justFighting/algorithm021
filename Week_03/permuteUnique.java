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
        public List<List<Integer>> permuteUnique(int[] nums) {
        //全排列（有重复元素）
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        Arrays.sort(nums);
        boolean[]used=new boolean[nums.length];
        track(nums,used,res,path);
        return res;
    }
    public void track(int[]nums,boolean[]used,List<List<Integer>>res,List<Integer>path){
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i])continue;
            if(i>0&&nums[i]==nums[i-1]&&!used[i-1])continue;
            path.add(nums[i]);
            used[i]=true;
            track(nums,used,res,path);
            used[i]=false;
            path.remove(path.size()-1);
        }
    }}
