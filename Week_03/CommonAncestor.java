    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //最近公共节点
        if(root==null||root==p||root==q)return root;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left==null)return right;
        if(right==null)return left;
        return root;        
    }
