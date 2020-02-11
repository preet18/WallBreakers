class ReverseVowels {
    public String reverseVowels(String str) {
        int n = str.length();
        char[] s = str.toCharArray();
        for(int i=0, j=n-1; i<j; ){
            if(s[i]!='a' && s[i]!='e' && s[i]!='i' && s[i]!='o' && s[i]!='u' && 
              s[i]!='A' && s[i]!='E' && s[i]!='I' && s[i]!='O' && s[i]!='U'){
                i++;
            }else if(s[j]!='a' && s[j]!='e' && s[j]!='i' && s[j]!='o' && s[j]!='u' &&
                    s[j]!='A' && s[j]!='E' && s[j]!='I' && s[j]!='O' && s[j]!='U'){
                j--;
            }else{
                char ch = s[i];
                s[i] = s[j];
                s[j] = ch;
                i++;
                j--;
            }
        }
        return new String(s);
    }
}
