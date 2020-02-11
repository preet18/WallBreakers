class ReverseWordsInAStringIII {
    public String reverseWords(String str) {
        
        int n = str.length();
        char[] s = str.toCharArray();
        int prev = 0;
        for(int i=0; i<n; i++){
            if(s[i]==' '){
                reverse(s, prev, i-1);
                prev = i+1;
            }
        }
        reverse(s, prev, n-1);
        StringBuilder res = new StringBuilder("");
        res.append(s);
        return res.toString();
    }
    
    public void reverse(char[] s, int first, int last){
        for(int i=first, j=last; i<j; i++, j--){
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
        }
    }
}
