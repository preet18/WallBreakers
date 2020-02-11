class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i=left; i<=right; i++){
            int n = i;
            boolean valid = true;
            while(n>0){
                int rem = n%10;
                n = n/10;
                if(rem==0){
                    valid = false;
                    break;
                }else if(i%rem!=0){
                    valid = false;
                    break;
                }
            }
            if(valid){
                res.add(i);
            }
        }
        return res;
    }
}
