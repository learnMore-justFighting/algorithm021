    //N叉树的前序遍历
    public List<Integer> preorder(Node root) {
        List<Integer> res=new ArrayList<>();
        Deque<Node> deque=new LinkedList<>();
        if(root!=null){
            deque.push(root);
        }
        while(!deque.isEmpty()){
            Node node=deque.pop();
            res.add(node.val);
            for(int i=node.children.size()-1;i>=0;i--){
                deque.push(node.children.get(i));
            }
        }
        return res;
    }
