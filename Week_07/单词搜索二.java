    public List<String> findWords(char[][] board, String[] words) {
        Set<String> res=new HashSet<>();
        Tire tire=new Tire();
        TireNode tireNode=tire.root;
        for(String word:words){
            tire.insert(word);
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                    dfs(board,i,j,res,tireNode);
            }
        }
        return new ArrayList<>(res);    
    }
    public void dfs(char[][]board,int i,int j,Set<String>res,TireNode root){
        if(i<0||i>=board.length||j<0||j>=board[i].length)return;
        root=root.next[board[i][j]-'a'];
        char oldChar=board[i][j];
        board[i][j]='0';
        if(root==null){
            board[i][j]=oldChar;
            return;
        }
        if(root.isEnd){
            res.add(root.val);
        }
        dfs(board,i-1,j,res,root);
        dfs(board,i+1,j,res,root);
        dfs(board,i,j-1,res,root);
        dfs(board,i,j+1,res,root);
        board[i][j]=oldChar;
    }
}
class Tire{
    class TireNode{
        boolean isEnd;
        TireNode[]next;
        String val;

        public TireNode(){
            isEnd=false;
            next=new TireNode[26];
        }
    }
    TireNode root=new TireNode();
    public void insert(String word){
        TireNode node=root;
        for(char c:word.toCharArray()){
            if(node.next[c-'a']==null){
                node.next[c-'a']=new TireNode();
            }
            node=node.next[c-'a'];
        }
        node.isEnd=true; 
        node.val=word;
    }
