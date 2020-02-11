class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int n = digits.length;
        for(int i=n-1; i>=0; i--){
            digits[i] += carry;
            carry = digits[i]/10;
            digits[i] = digits[i]%10;
        }
        
        if(carry>0){
            int[] res = new int[n+1];
            for(int i=1; i<=n; i++){
                res[i] = digits[i-1];
            }
            res[0] = carry;
            return res;
        }else{
            return digits;
        }
        
    }
}
