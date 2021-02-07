    public String reverseStr(String s, int k) {
        int n=s.length();
        char[]chars=s.toCharArray();
        for(int start=0;start<n;start+=2*k){
            int i=start;
            int j=Math.min(start+k-1,n-1);
            while(i<j){
                char tem=chars[j];
                chars[j--]=chars[i];
                chars[i++]=tem;
            }
        }
        return new String(chars);
    }
