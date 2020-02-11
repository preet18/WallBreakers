class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        int temp = (int)(Math.log(n)/Math.log(2));
        if(Math.pow(2, temp)==n){
            return true;
        }
        return false;
    }
}
