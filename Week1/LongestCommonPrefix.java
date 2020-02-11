class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        int n = strs[0].length();
        int i = 0;
        while(i<n){
            char ch = strs[0].charAt(i);
            for(String str : strs){
                if(str.length()>i && str.charAt(i)==ch){
                    continue;
                }else{
                    return strs[0].substring(0,i);
                }
            }
            i++;
        }
        return strs[0].substring(0,i);
    }
}
