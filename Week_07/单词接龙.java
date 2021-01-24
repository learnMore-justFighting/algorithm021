    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String>wordStorage=new HashSet<>(wordList);
        if(wordList.size()==0||!wordStorage.contains(endWord)){
            return 0;
        }
        Set<String>q1=new HashSet<>();
        Set<String>q2=new HashSet<>();
        Set<String>temStorage=new HashSet<>();//临时存放
        q1.add(beginWord);
        q2.add(endWord);
        int step=1;
        while(!q1.isEmpty()&&!q2.isEmpty()){
            step++;
            if(q1.size()>q2.size()){
                Set<String>tem=new HashSet<>(q1);
                q1=q2;
                q2=tem;
            }
            for(String s:q1){
                char[]chars=s.toCharArray();
                for(int i=0;i<chars.length;i++){
                    char oldChar=chars[i];
                    for(char j='a';j<='z';j++){
                        if(chars[i]!=j){
                            chars[i]=j;
                        }
                        String newString=new String(chars);
                        if(q2.contains(newString)){
                            return step;
                        }else if(wordStorage.contains(newString)){
                            temStorage.add(newString);
                            wordStorage.remove(newString);
                        }
                    }
                    chars[i]=oldChar;
                }
            }
            q1=new HashSet<>(temStorage);
            temStorage.clear();
        }
        return 0;
    }
