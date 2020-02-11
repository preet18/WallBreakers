class HammingDistance {
    public int hammingDistance(int x, int y) {
        int count = 0;
        while(x>0 || y>0){
            int r1 = x%2;
            x = x/2;
            int r2 = y%2;
            y = y/2;
            if(r1!=r2){
                count++;
            }
        }
        return count;
    }
}
