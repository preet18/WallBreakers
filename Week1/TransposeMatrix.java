class TransposeMatrix {
    //O(N*M)|O(N*M)
    public int[][] transpose(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int[][] mat = new int[n][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[j][i] = A[i][j];
            }
        }
        return mat;
    }
}
