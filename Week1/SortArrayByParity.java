class SortArrayByParity {
    //O(N)|O(1)
    public int[] sortArrayByParity(int[] A) {
        int n = A.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            if(A[i]%2==0){
                i++;
            }else{
                if(A[j]%2==0){
                    int temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                    i++;
                    j--;
                }else{
                    j--;
                }
            }
        }
        return A;
    }
}
