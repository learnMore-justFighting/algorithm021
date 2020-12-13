    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        recrusion(root,res);
        return res;
    }
    public void recrusion(TreeNode root,List<Integer> res){
        if(root!=null){
            recrusion(root.left,res);
            res.add(root.val);
            recrusion(root.right,res);
        }
    }
