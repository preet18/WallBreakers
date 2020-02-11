class ValidPanlindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int n = s.length();
        for(int i=0, j=n-1; i<j; ){
            if(!((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='0'&&s.charAt(i)<='9'))){
                i++;
            }else if(!((s.charAt(j)>='a'&&s.charAt(j)<='z')||(s.charAt(j)>='0'&&s.charAt(j)<='9'))){
                j--;
            }else if(s.charAt(i)==s.charAt(j)){
                    i++;
                    j--;
            }else{
                return false;
            }
            
        }
        return true;
    }
}
