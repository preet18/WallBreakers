class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int i=1; i<=n; i++){
            String ans = "";
            if(i%3==0){
                ans += "Fizz";
            }
            if(i%5==0){
                ans += "Buzz";
            }
            if(ans.length()==0){
                ans += i;
            }
            res.add(ans);
        }
        return res;
    }
}
