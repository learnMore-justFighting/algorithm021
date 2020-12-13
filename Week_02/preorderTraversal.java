    //二叉树的前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        recrusion(root,res);
        return res;
    }
    public void recrusion(TreeNode root,List<Integer> res){
        if(root!=null){
            res.add(root.val);
            recrusion(root.left,res);
            recrusion(root.right,res);
        }
    }
