class BinaryGap {
    public int binaryGap(int N) {
        int res = 0;
        int prev = -1;
        int i = 0;
        while(N>0){
            int rem = N%2;
            N = N/2;
            if(rem==1){
                if(prev!=-1){
                    res = Math.max(i-prev, res);
                }
                prev = i;
            }
            i++;
        }
        return res;
    }
}
