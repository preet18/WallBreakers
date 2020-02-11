class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] alpha = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            alpha[(int)(ch-'a')]++;
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            alpha[(int)(ch-'a')]--;
        }
        
        for(int i=0; i<26; i++){
            if(alpha[i]!=0){
                return false;
            }
        }
        return true;
    }
}
