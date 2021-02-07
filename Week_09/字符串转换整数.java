    public int myAtoi(String s) {
        char[]str=s.toCharArray();
        int n=s.length();
        if(n==0){
            return 0;
        }
        int begin=0;
        while(begin<n&&str[begin]==' '){
            begin++;
        }
        if(begin==n){
            return 0;
        }
        int sign=1;
        if(str[begin]=='+'){
            begin++;
        }else if(str[begin]=='-'){
            sign=-1;
            begin++;
        }
        int res=0;
        for(int i=begin;i<n;i++){
            if(str[i]<'0'||str[i]>'9'){
                break;
            }
            if(res>Integer.MAX_VALUE/10||res==Integer.MAX_VALUE/10&&((str[i]-'0')>Integer.MAX_VALUE%10)){
                return Integer.MAX_VALUE;
            }
            if(res<Integer.MIN_VALUE/10||res==Integer.MIN_VALUE/10&&((str[i]-'0')>-(Integer.MIN_VALUE%10))){
                return Integer.MIN_VALUE;
            }
            res=10*res+sign*(str[i]-'0');
        }
        return res;
    }
