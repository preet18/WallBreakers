class FriendsCircle {
    int noOfComponents = 0;
    public int findCircleNum(int[][] M) {
        
        int N = M.length;
        int[] arr = new int[N];
        int[] size = new int[N];
        noOfComponents = N;
        for(int i=0; i<N; i++){
            arr[i] = i;
            size[i] = 1;
        }
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(i!=j && M[i][j]==1){
                    union(arr, size, i, j);
                }
            }
        }
        
        
        return noOfComponents;
    }
    
    public int root(int[] arr, int a){
        int i = a;
        while(i!=arr[i]){
            i = arr[i];
        }
        return i;
    }
    
    public void union(int[] arr, int[] size, int a, int b){
        int root_A = root(arr, a);
        int root_B = root(arr, b);
        
        if(root_A!=root_B){
            if(size[a]<=size[b]){
                arr[root_A] = root_B;
                size[root_B] += size[root_A];
            }else{
                arr[root_B] = root_A;
                size[root_A] += size[root_B];
            }
            noOfComponents--;
        }
    }
    
    
}
