class FlippingAnImage {
    //O(M*N)|O(1)
    public int[][] flipAndInvertImage(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        for(int i=0; i<m; i++){
            for(int j=0, k=n-1; j<=k; j++,k--){
                int temp = A[i][j];
                A[i][j] = Math.abs(A[i][k]-1);
                A[i][k] = Math.abs(temp-1);
            }
        }
        return A;
    }
}
