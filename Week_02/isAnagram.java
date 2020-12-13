    //有效的字母异位词
    public boolean isAnagram(String s, String t) {
        char[] char1=s.toCharArray();
        char[] char2=t.toCharArray();
        if(char1.length!=char2.length){
            return false;
        }
        int num[]=new int[26];
        for(int i=0;i<char1.length;i++){
            num[char1[i]-'a']++;
            num[char2[i]-'a']--;
        }
        for(int i=0;i<26;i++){
            if(num[i]!=0){
                return false;
            }
        }
        return true;
    }
