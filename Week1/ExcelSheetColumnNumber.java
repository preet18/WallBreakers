class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        char[] str = s.toCharArray();
        int res = 0;
        int n = str.length;
        for(int i=n-1; i>=0; i--){
            res += ((int)str[i]-64)*Math.pow(26, n-1-i);
        }
        return res;
    }
}
