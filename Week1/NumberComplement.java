class NumberComplement {
    public int findComplement(int num) {
        int res = 0;
        int i = 0;
        while(num>0){
            int rem = num%2;
            num = num/2;
            res += Math.pow(2,i)*(1-rem);
            i++;
        }
        return res;
    }
}
