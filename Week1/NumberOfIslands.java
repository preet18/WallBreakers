class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if(grid.length==0 || grid[0].length==0) return 0;
        int M = grid.length;
        int N = grid[0].length;
        int count = 0;
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(grid[i][j]=='1'){
                    numIslandsUtil(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    
    
    public void numIslandsUtil(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!='1') return;
        grid[i][j] = '0';
        numIslandsUtil(grid, i+1, j);
        numIslandsUtil(grid, i-1, j);
        numIslandsUtil(grid, i, j+1);
        numIslandsUtil(grid, i, j-1);
    }
}
