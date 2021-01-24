    public int minMutation(String start, String end, String[] bank) {
        Set<String>bankSet=new HashSet<>(Arrays.asList(bank));
        if(!bankSet.contains(end)){
            return -1;
        }
        Set<String> tem=new HashSet<>();
        char[]chars={'A','C','G','T'};  
        Set<String> q1=new HashSet<>();//前向
        Set<String> q2=new HashSet<>();//反向
        int step=0;
        q1.add(start);
        q2.add(end);
        while(!q1.isEmpty()&&!q2.isEmpty()){
            step++;
            if(q1.size()>q2.size()){
                Set<String> temSet=new HashSet<>(q1);
                q1=q2;
                q2=temSet;
            }
            for(String s:q1){
                char[] cur_char=s.toCharArray();
                for(int i=cur_char.length-1;i>=0;i--){
                    char oldChar=cur_char[i];
                    for(int j=0;j<4;j++){
                        cur_char[i]=chars[j];
                        String newString=new String(cur_char);
                        if(q2.contains(newString)){
                            return step;
                        }else if(bankSet.contains(newString)){
                            tem.add(newString);
                            bankSet.remove(newString);
                        }
                    }
                    cur_char[i]=oldChar;
                }       
        }
        q1=new HashSet<>(tem);
        tem.clear();       
    }
    return -1;
